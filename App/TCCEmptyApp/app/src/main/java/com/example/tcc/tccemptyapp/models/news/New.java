package com.example.tcc.tccemptyapp.models.news;

import com.example.tcc.tccemptyapp.models.BaseModel;
import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Alan on 12/12/2016.
 */
public class New extends BaseModel {

    private class Author extends BaseModel {
        private String name;
        private String id;
    }

    private String id;
    private String message;
    @SerializedName("created_time")
    private String createdTime;
    @SerializedName("full_picture")
    private String picture;
    @SerializedName("from")
    private Author author;
    private String link;
    private String story;

    private transient String formattedDate;

    public String getTitle() {
        return this.author.name;
    }

    public String getDate() {
        if (this.formattedDate == null) {
            setFormattedDate();
        }
        return this.formattedDate;
    }

    public String getMessage() {
        if (this.message != null) {
            return this.message;
        }
        return this.story;
    }

    public String getPicture() {
        return this.picture;
    }

    private void setFormattedDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", new Locale("pt-BR"));

        try {
            Date date = format.parse(this.createdTime);

            format.applyPattern("dd/MM/yyyy HH:mm");
            this.formattedDate = format.format(date);
        } catch (ParseException e) {
            this.formattedDate = this.createdTime;
        }
    }
}
