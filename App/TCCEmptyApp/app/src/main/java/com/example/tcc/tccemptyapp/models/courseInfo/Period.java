package com.example.tcc.tccemptyapp.models.courseInfo;

import com.example.tcc.tccemptyapp.models.BaseModel;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class Period extends BaseModel {
    private String name;
    private List<Course> courseList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
