package com.example.tcc.tccemptyapp.providers.courseInfo;

import com.example.tcc.tccemptyapp.models.courseInfo.CourseDetail;

/**
 * Created by Alan on 23/10/2016.
 */
public interface CourseDetailResponse {
    void onCourseDetailSuccess(CourseDetail course);
    void onCourseDetailFailure();
}
