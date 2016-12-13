package com.example.tcc.tccemptyapp.providers.news;

import com.example.tcc.tccemptyapp.models.news.New;

/**
 * Created by Alan on 13/12/2016.
 */
public interface NewDetailsResponse {
    void onNewDetailsSuccess(New newDetails);
    void onNewDetailsFailure();
}
