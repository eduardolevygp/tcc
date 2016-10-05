package com.example.tcc.tccemptyapp.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

/**
 * Created by Alan on 04/10/2016.
 */
public abstract class BaseModel {

    public String toJson(){
        return getGsonInstance().toJson(this);
    }

    public static <T extends BaseModel> T toModel(String json, Class<T> modelClass){
        try {
            return getGsonInstance().fromJson(json, modelClass);
        }
        catch(JsonSyntaxException ex) {
            return null;
        }
    }

    private static Gson getGsonInstance() {
        String dateFormat = "yyyyMMdd";
        return new GsonBuilder().setDateFormat(dateFormat).create();
    }
}
