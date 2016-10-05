package com.example.tcc.tccemptyapp.providers;

/**
 * Created by Alan on 04/10/2016.
 */
public class ADMProvider {
    // Still test code
    public void reqTest() {
        RequestService request = new RequestService();
        request.performRequest(HttpMethod.GET, "http://httpbin.org/get", new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
            }

            @Override
            public void onFailure(String jsonResponse) {
            }
        });
    }
}
