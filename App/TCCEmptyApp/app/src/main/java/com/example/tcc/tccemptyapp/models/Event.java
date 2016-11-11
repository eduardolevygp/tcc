package com.example.tcc.tccemptyapp.models;

/**
 * Created by Alan on 11/11/2016.
 */
public class Event extends BaseModel {
    private String title;
    private String date;
    private String time;
    private String location;
    private String description;
    private String imageUrl;

    private transient String dateTime;

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
        return imageUrl;
    }

    // Remover setters depois que deleter mock
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
