package com.example.tcc.tccemptyapp.models.news;

import com.example.tcc.tccemptyapp.models.BaseModel;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Alan on 12/12/2016.
 */
public class New extends BaseModel {
    private String id;
    private String message;
    @SerializedName("created_time")
    private String createdTime;
}
