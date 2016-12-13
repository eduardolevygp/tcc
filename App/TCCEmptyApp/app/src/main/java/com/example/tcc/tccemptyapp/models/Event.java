package com.example.tcc.tccemptyapp.models;

import com.example.tcc.tccemptyapp.constants.APIRoutes;

/**
 * Created by Alan on 11/11/2016.
 */
public class Event extends BaseModel {
    private String id;
    private String title;
    private String date;
    private String time;
    private String location;
    private String description;
    private String image;

    private transient String dateTime;
    private transient String imageUrl;

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public String getDateAndTime() {
        if (this.dateTime == null) {
            this.dateTime = this.date + ", " + this.time;
        }
        return this.dateTime;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        if (this.imageUrl == null && this.image != null) {
            this.imageUrl = APIRoutes.BASE_URL_EVENT_IMAGE + this.image;
        }
        return this.imageUrl;
    }
}
