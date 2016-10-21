package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CoursesAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CoursesListener;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;

/**
 * Created by Alan on 21/10/2016.
 */
public class CoursesFragment extends CourseInfoFragment {

    private static final String PERIOD_KEY = "period";
    private Period mPeriod;

    public static CoursesFragment newInstance(Period period) {
        Bundle args = new Bundle();
        CoursesFragment fragment = new CoursesFragment();
        String serializedPeriod = period.toJson();

        args.putString(PERIOD_KEY, serializedPeriod);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setData() {
        String serializedPeriod = getArguments().getString(PERIOD_KEY);
        mPeriod = Period.toModel(serializedPeriod, Period.class);
    }

    @Override
    protected int getFragmentTitle() {
        return R.string.fragment_course;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new CoursesAdapter(getContext(), mPeriod.getCourseList(), getListener());
    }

    private CoursesListener getListener() {
        return new CoursesListener() {
            @Override
            public void onCourseClicked(Course course) {
                CourseDetailsFragment fragment = CourseDetailsFragment.newInstance(course);
                goToFragment(fragment);
            }
        };
    }
}
