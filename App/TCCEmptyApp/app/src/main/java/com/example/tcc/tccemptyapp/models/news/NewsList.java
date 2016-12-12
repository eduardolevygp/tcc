package com.example.tcc.tccemptyapp.models.news;

import com.example.tcc.tccemptyapp.models.BaseModel;

import java.util.List;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsList extends BaseModel {

    private class Paging extends BaseModel {
        private String previous;
        private String next;
    }

    private List<New> data;
    private Paging paging;

    public List<New> getData() {
        return this.data;
    }

    public String getNextPageUrl() {
        return this.paging.next;
    }
}
