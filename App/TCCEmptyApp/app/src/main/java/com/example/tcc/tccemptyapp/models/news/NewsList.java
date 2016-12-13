package com.example.tcc.tccemptyapp.models.news;

import com.example.tcc.tccemptyapp.models.BaseModel;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsList extends BaseModel {

    private class Pagination extends BaseModel {
        @SerializedName("curr_page")
        private Integer currPage;
        @SerializedName("has_more")
        private Boolean hasMore;
    }

    private List<New> data;
    private Pagination pagination;

    public void updateWithList(NewsList newsList) {
        this.data.addAll(newsList.data);
        this.pagination = newsList.pagination;
    }

    public void setStopLoading() {
        this.pagination.hasMore = false;
    }

    public List<New> getData() {
        return this.data;
    }

    public boolean hasMorePages() {
        return this.pagination.hasMore;
    }

    public Integer getNexPage() {
        return this.pagination.currPage + 1;
    }
}
