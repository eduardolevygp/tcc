package com.example.tcc.tccemptyapp.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alan on 04/10/2016.
 */
public abstract class BaseModel {

    public static <T extends BaseModel> T toModel(String json, Class<T> modelClass){
        try {
            return getGsonInstance().fromJson(json, modelClass);
        }
        catch(JsonSyntaxException ex) {
            return null;
        }
    }

    public static <T extends BaseModel> List<T> toListModel(String json, Class<T> modelClass){
        try {
            JSONArray arrayOfJsonString =  new JSONArray(json);
            int length = arrayOfJsonString.length();
            List<T> list = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                T listMember = T.toModel(arrayOfJsonString.getJSONObject(i).toString(), modelClass);
                list.add(i, listMember);
            }
            return list;
        }
        catch(JSONException ex) {
            return null;
        }
    }

    private static Gson getGsonInstance() {
        String dateFormat = "yyyyMMdd";
        return new GsonBuilder().setDateFormat(dateFormat).create();
    }

    public String toJson(){
        return getGsonInstance().toJson(this);
    }
}
