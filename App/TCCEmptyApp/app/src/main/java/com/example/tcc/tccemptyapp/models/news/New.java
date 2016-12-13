package com.example.tcc.tccemptyapp.models.news;

import com.example.tcc.tccemptyapp.constants.APIRoutes;
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

    private String id;
    private String message;
    @SerializedName("created_time")
    private String createdTime;
    private String picture;
    private String link;

    private transient String formattedDate;

    public String getDate() {
        if (this.formattedDate == null) {
            setFormattedDate();
        }
        return this.formattedDate;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPicture() {
        return this.picture != null ? APIRoutes.NEWS_IMAGES + this.picture : null;
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

    public String getId() {
        return this.id;
    }

    public String getLink() {
        return this.link;
    }
}
