package com.example.tcc.tccemptyapp.providers.general;

/**
 * Created by Alan on 04/10/2016.
 */
public interface ResponseHandler {
    void onSuccess(String jsonResponse);
    void onFailure(String jsonResponse);
}
