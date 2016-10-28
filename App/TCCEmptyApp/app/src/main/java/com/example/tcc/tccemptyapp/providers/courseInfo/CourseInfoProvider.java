package com.example.tcc.tccemptyapp.providers.courseInfo;

import com.example.tcc.tccemptyapp.constants.APIRoutes;
import com.example.tcc.tccemptyapp.fragments.courseInfo.CourseDetailsFragment;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;
import com.example.tcc.tccemptyapp.models.courseInfo.CourseDetail;
import com.example.tcc.tccemptyapp.providers.general.HttpMethod;
import com.example.tcc.tccemptyapp.providers.general.RequestService;
import com.example.tcc.tccemptyapp.providers.general.ResponseHandler;

import java.util.List;

/**
 * Created by Alan on 23/10/2016.
 */
public class CourseInfoProvider {

    public void getCourseList(final int id, final CourseListResponse handler) {
        RequestService request = new RequestService();
        String route = APIRoutes.COURSE_LIST_URL + id;

        request.performRequest(HttpMethod.GET, route, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                List<Course> courseList = Course.toListModel(jsonResponse, Course.class);
                if (courseList != null) {
                    handler.onCourseListSuccess(courseList);
                } else {
                    handler.onCourseListFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onCourseListFailure();
            }
        });
    }

    public void getCourseDetails(final int id, final CourseDetailResponse handler) {
        RequestService request = new RequestService();
        String route = APIRoutes.COURSE_DETAILS_URL + id;

        request.performRequest(HttpMethod.GET, route, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                CourseDetail course = CourseDetail.toModel(jsonResponse, CourseDetail.class);
                if (course != null) {
                    handler.onCourseDetailSuccess(course);
                } else {
                    handler.onCourseDetailFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onCourseDetailFailure();
            }
        });
    }
}
