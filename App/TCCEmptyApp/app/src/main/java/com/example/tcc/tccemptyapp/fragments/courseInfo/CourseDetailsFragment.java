package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;


/**
 * Created by Alan on 21/10/2016.
 */
public class CourseDetailsFragment extends BaseFragment {

    private static final String COURSE_KEY = "course";
    private TextView mTextView;
    private Course mCourse;

    public static CourseDetailsFragment newInstance(Course course) {
        Bundle args = new Bundle();
        CourseDetailsFragment fragment = new CourseDetailsFragment();
        String jsonCourse = course.toJson();

        args.putString(COURSE_KEY, jsonCourse);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_course_details, inflater, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView = (TextView) view.findViewById(R.id.courses_details_textview);

        setCourse();
        getActivity().setTitle(mCourse.getName());
        String text = "Detalhes do Curso " + mCourse.getName() + " cujo ID é " + mCourse.getId();
        mTextView.setText(text);
    }

    @Override
    protected void onPlaceholderButtonSelected() {

    }

    private void setCourse() {
        String jsonCourse = getArguments().getString(COURSE_KEY);
        mCourse = Course.toModel(jsonCourse, Course.class);
    }

}
