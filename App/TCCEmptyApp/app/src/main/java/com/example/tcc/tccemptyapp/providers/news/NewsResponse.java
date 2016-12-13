package com.example.tcc.tccemptyapp.providers.news;

import com.example.tcc.tccemptyapp.models.news.NewsList;

/**
 * Created by Alan on 12/12/2016.
 */
public interface NewsResponse {
    void onNewsSuccess(NewsList newsList);
    void onNewsFailure();
}
