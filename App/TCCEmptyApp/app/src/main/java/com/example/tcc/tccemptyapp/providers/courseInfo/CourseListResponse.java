package com.example.tcc.tccemptyapp.providers.courseInfo;

import com.example.tcc.tccemptyapp.models.courseInfo.Course;

import java.util.List;

/**
 * Created by Alan on 23/10/2016.
 */
public interface CourseListResponse {
    void onCourseListSuccess(List<Course> courseList);
    void onCourseListFailure();
}
