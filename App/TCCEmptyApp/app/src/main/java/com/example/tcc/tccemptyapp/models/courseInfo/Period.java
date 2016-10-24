package com.example.tcc.tccemptyapp.models.courseInfo;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class Period extends CourseInfo {
    private List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}

