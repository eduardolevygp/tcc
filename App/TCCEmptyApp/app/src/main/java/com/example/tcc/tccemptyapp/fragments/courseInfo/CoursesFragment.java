package com.example.tcc.tccemptyapp.fragments.courseInfo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CoursesAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CoursesListener;
import com.example.tcc.tccemptyapp.components.PlaceholderEmptyList;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseInfoProvider;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseListResponse;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public class CoursesFragment extends BaseFragment {

    private static final String ID_KEY = "idKey";
    private static final String PARENT_NAME_KEY = "parentNameKey";
    private RecyclerView mRecyclerView;
    private PlaceholderEmptyList mPlaceholderEmptyList;
    private List<Course> mCourseList;

    public static CoursesFragment newInstance(int id) {
        return newInstance(id, null);
    }

    public static CoursesFragment newInstance(int id, String parentName) {
        Bundle args = new Bundle();
        CoursesFragment fragment = new CoursesFragment();

        args.putInt(ID_KEY, id);
        args.putString(PARENT_NAME_KEY, parentName);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_course_info, inflater, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_course_info);
        mPlaceholderEmptyList = (PlaceholderEmptyList) view.findViewById(R.id.placeholder_empty_list);

        setTitle();
        setEmptyListPlaceholderButton();
        fetchCourseList();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchCourseList();
    }

    private void fetchCourseList() {
        int id = getArguments().getInt(ID_KEY);

        showLoading();
        new CourseInfoProvider().getCourseList(id, new CourseListResponse() {
            @Override
            public void onCourseListSuccess(List<Course> courseList) {
                if (courseList.isEmpty()) {
                    mPlaceholderEmptyList.setVisibility(View.VISIBLE);
                } else {
                    mCourseList = courseList;
                    setAdapter();
                }

                showContent();
            }

            @Override
            public void onCourseListFailure() {
                showPlaceholder();
            }
        });
    }

    private void setTitle() {
        String title = getArguments().getString(PARENT_NAME_KEY);

        if (title == null) {
            title = getContext().getString(R.string.fragment_courses_title);
        }

        getActivity().setTitle(title);
    }

    private void setEmptyListPlaceholderButton() {
        mPlaceholderEmptyList.setButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    private void setAdapter() {
        CoursesAdapter adapter = new CoursesAdapter(getContext(), mCourseList, getListener());

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private CoursesListener getListener() {
        return new CoursesListener() {
            @Override
            public void onCourseClicked(Course course) {
                CourseDetailsFragment fragment = CourseDetailsFragment.newInstance(course.getId());
                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }
}
