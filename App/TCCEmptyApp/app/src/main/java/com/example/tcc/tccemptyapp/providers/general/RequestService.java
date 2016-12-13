package com.example.tcc.tccemptyapp.providers.general;

import com.example.tcc.tccemptyapp.constants.APIRoutes;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Alan on 04/10/2016.
 */
public class RequestService {

    private AsyncHttpClient mClient;

    public RequestService() {
        mClient = new AsyncHttpClient();
    }

    public void performRequest(final int method, final String route, final ResponseHandler handler) {
        performRequest(method, route, true, null, handler);
    }

    public void performRequest(final int method, final String route, final RequestParams params, final ResponseHandler handler) {
        performRequest(method, route, true, params, handler);
    }

    public void performRequest(final int method, final String route, final Boolean useBase, final RequestParams params, final ResponseHandler handler) {

        String url;
        if (useBase) {
            url = APIRoutes.BASE_URL + route;
        } else {
            url = route;
        }

        switch (method) {
            case HttpMethod.GET:
                mClient.get(url, params, getJsonResponseHandler(handler));
                break;

            case HttpMethod.POST:
                mClient.post(url, params, getJsonResponseHandler(handler));
                break;

            case HttpMethod.PUT:
                mClient.put(url, params, getJsonResponseHandler(handler));
                break;

            case HttpMethod.DELETE:
                mClient.delete(url, params, getJsonResponseHandler(handler));
                break;
        }
    }

    private JsonHttpResponseHandler getJsonResponseHandler(final ResponseHandler handler) {
        return new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                handler.onSuccess(response.toString());
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                super.onSuccess(statusCode, headers, response);
                handler.onSuccess(response.toString());
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                super.onSuccess(statusCode, headers, responseString);
                handler.onSuccess(responseString);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                handler.onFailure(responseString);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                handler.onFailure(errorResponse != null ? errorResponse.toString() : "");
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                handler.onFailure(errorResponse != null ? errorResponse.toString() : "");
            }

        };
    }
}
