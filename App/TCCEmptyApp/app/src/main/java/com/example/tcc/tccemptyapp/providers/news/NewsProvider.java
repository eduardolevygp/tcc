package com.example.tcc.tccemptyapp.providers.news;

import com.example.tcc.tccemptyapp.constants.APIRoutes;
import com.example.tcc.tccemptyapp.models.news.New;
import com.example.tcc.tccemptyapp.models.news.NewsList;
import com.example.tcc.tccemptyapp.providers.general.HttpMethod;
import com.example.tcc.tccemptyapp.providers.general.RequestService;
import com.example.tcc.tccemptyapp.providers.general.ResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsProvider {

    public void getNews(final Integer page, final NewsResponse handler) {
        if (page == null) {
            handler.onNewsFailure();
            return;
        }

        RequestParams params = new RequestParams("page", page);
        new RequestService().performRequest(HttpMethod.GET, APIRoutes.NEWS_LIST_URL, params, new ResponseHandler() {
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
        });
    }

    public void getNewsDetail(final String id, final NewDetailsResponse handler) {
        new RequestService().performRequest(HttpMethod.GET, APIRoutes.NEWS_DETAIL_URL + id, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                New newDetails = New.toModel(jsonResponse, New.class);
                if (newDetails != null) {
                    handler.onNewDetailsSuccess(newDetails);
                } else {
                    handler.onNewDetailsFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onNewDetailsFailure();
            }
        });
    }
}
