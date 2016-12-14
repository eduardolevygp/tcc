package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.models.courseInfo.CourseDetail;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseDetailResponse;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseInfoProvider;


/**
 * Created by Alan on 21/10/2016.
 */
public class CourseDetailsFragment extends BaseFragment {

    private static final String COURSE_KEY = "course";
    private TextView mTitle;
    private TextView mTextView;

    public static CourseDetailsFragment newInstance(int id) {
        Bundle args = new Bundle();
        CourseDetailsFragment fragment = new CourseDetailsFragment();

        args.putInt(COURSE_KEY, id);
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
        mTitle = (TextView) view.findViewById(R.id.courses_details_title);

        getActivity().setTitle(R.string.fragment_course_details_title);
        fetchDetails();
    }

    private void fetchDetails() {
        int id = getArguments().getInt(COURSE_KEY);

        showLoading();
        new CourseInfoProvider().getCourseDetails(id, new CourseDetailResponse() {
            @Override
            public void onCourseDetailSuccess(CourseDetail course) {
                mTitle.setText(course.getCodeAndName());
                mTextView.setText(course.getInfo());
                showContent();
            }

            @Override
            public void onCourseDetailFailure() {
                showPlaceholder();
            }
        });
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchDetails();
    }
}
