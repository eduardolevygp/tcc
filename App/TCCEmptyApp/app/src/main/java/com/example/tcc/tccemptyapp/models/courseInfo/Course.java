package com.example.tcc.tccemptyapp.models.courseInfo;

import com.example.tcc.tccemptyapp.models.BaseModel;

/**
 * Created by Alan on 17/10/2016.
 */
public class Course extends BaseModel {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
