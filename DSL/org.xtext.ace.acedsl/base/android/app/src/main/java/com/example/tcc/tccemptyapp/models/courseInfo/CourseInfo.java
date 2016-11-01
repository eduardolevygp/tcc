package com.example.tcc.tccemptyapp.models.courseInfo;

import com.example.tcc.tccemptyapp.models.BaseModel;

/**
 * Created by Alan on 23/10/2016.
 */
public abstract class CourseInfo extends BaseModel{
    public int id = 0;
    public String name;

    public CourseInfo(String name) {
        this.name = name;
    }

    public CourseInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
