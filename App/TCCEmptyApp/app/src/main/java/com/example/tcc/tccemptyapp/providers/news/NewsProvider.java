package com.example.tcc.tccemptyapp.providers.news;

import com.example.tcc.tccemptyapp.constants.APIRoutes;
import com.example.tcc.tccemptyapp.models.BaseModel;
import com.example.tcc.tccemptyapp.models.news.NewsList;
import com.example.tcc.tccemptyapp.providers.general.HttpMethod;
import com.example.tcc.tccemptyapp.providers.general.RequestService;
import com.example.tcc.tccemptyapp.providers.general.ResponseHandler;
import com.google.gson.annotations.SerializedName;
import com.loopj.android.http.RequestParams;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsProvider {

    private class NewsToken extends BaseModel {
        @SerializedName("access_token")
        private String accessToken;
    }

    private interface NewsTokenResponse {
        void onNewsTokenSuccess(NewsToken newsToken);
        void onNewsTokenFailure();
    }

    private void getAccessToken(final NewsTokenResponse handler) {
        new RequestService().performRequest(HttpMethod.GET, APIRoutes.NEWS_FACEBOOK_TOKEN_URL, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                NewsToken response = NewsToken.toModel(jsonResponse, NewsToken.class);
                if (response != null) {
                    handler.onNewsTokenSuccess(response);
                } else {
                    handler.onNewsTokenFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onNewsTokenFailure();
            }
        });
    }

    public void getNews(final NewsResponse handler) {
        getAccessToken(new NewsTokenResponse() {
            @Override
            public void onNewsTokenSuccess(NewsToken newsToken) {
                performNewsRequest(newsToken, handler);
            }

            @Override
            public void onNewsTokenFailure() {
                handler.onNewsFailure();
            }
        });
    }

    public void getNews(final String pagedUrl, final NewsResponse handler) {
        new RequestService().performRequest(HttpMethod.GET, pagedUrl, false, null, getNewsResponseHandler(handler));
    }

    private void performNewsRequest(final NewsToken newsToken, final NewsResponse handler) {
        RequestParams params = new RequestParams("access_token", newsToken.accessToken);
        new RequestService().performRequest(HttpMethod.GET, APIRoutes.NEWS_FACEBOOK_URL, false, params, getNewsResponseHandler(handler));
    }

    private ResponseHandler getNewsResponseHandler(final NewsResponse handler) {
        return new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                NewsList newsList = NewsList.toModel(jsonResponse, NewsList.class);
                if (newsList != null) {
                    handler.onNewsSuccess(newsList);
                } else {
                    handler.onNewsFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onNewsFailure();
            }
        };
    }
}
