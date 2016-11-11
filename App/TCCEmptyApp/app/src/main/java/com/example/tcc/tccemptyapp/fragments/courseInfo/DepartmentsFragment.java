package com.example.tcc.tccemptyapp.fragments.courseInfo;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.DepartmentsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.DepartmentsListener;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;
import com.example.tcc.tccemptyapp.models.courseInfo.CourseInfoStructure;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsFragment extends CourseInfoFragment {

    @Override
    protected void setParentObjectData() {}

    @Override
    protected String getFragmentTitle() {
        return getContext().getString(R.string.fragment_courses_title);
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new DepartmentsAdapter(getContext(), CourseInfoStructure.getInstance().getDepartmentList(), getDepartmentsListener());
    }

    private DepartmentsListener getDepartmentsListener() {
        return new DepartmentsListener() {
            @Override
            public void onDepartmentClick(Department department) {
                BaseFragment fragment;

                if (department.getId() > 0) {
                    fragment = CoursesFragment.newInstance(department.getId(), department.getName());
                } else if (department.getPeriodList() != null) {
                    fragment = PeriodsFragment.newInstance(department);
                } else {
                    fragment = ProgramsFragment.newInstance(department);
                }

                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }

}
