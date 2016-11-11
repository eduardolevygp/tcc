package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.PeriodsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.PeriodsListener;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

import java.util.List;


/**
 * Created by Alan on 21/10/2016.
 */
public class PeriodsFragment extends CourseInfoFragment {

    private static final String PARENT_KEY = "parent";
    private Program mProgram;
    private Department mDepartment;

    public static PeriodsFragment newInstance(final Department department) {
        return newInstance(department, null);
    }

    public static PeriodsFragment newInstance(final Program program) {
        return newInstance(null, program);
    }

    private static PeriodsFragment newInstance(final Department department, final Program program) {
        Bundle args = new Bundle();
        PeriodsFragment fragment = new PeriodsFragment();
        String jsonParent;

        if (department != null) {
            jsonParent = department.toJson();
        } else {
            jsonParent = program.toJson();
        }

        args.putString(PARENT_KEY, jsonParent);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setParentObjectData() {
        String jsonProgram = getArguments().getString(PARENT_KEY);
        mProgram = Program.toModel(jsonProgram, Program.class);
        mDepartment = Department.toModel(jsonProgram, Department.class);
    }

    @Override
    protected String getFragmentTitle() {
        String title;

        if (mDepartment != null) {
            title = mDepartment.getName();
        } else {
            title = mProgram.getName();
        }

        return title;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        List<Period> periodList;

        if (mDepartment != null) {
             periodList = mDepartment.getPeriodList();
        } else {
            periodList = mProgram.getPeriodList();
        }

        return new PeriodsAdapter(getContext(), periodList, getListener());
    }

    private PeriodsListener getListener() {
        return new PeriodsListener() {
            @Override
            public void onPeriodClicked(Period period) {
                CoursesFragment fragment = CoursesFragment.newInstance(period.getId(), period.getName());
                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }
}
