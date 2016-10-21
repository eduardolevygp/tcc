package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.ProgramsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.ProgramsListener;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

/**
 * Created by Alan on 21/10/2016.
 */
public class ProgramsFragment extends CourseInfoFragment {

    private static final String DEPARTMENT_KEY = "department";
    private Department mDepartment;

    public static ProgramsFragment newInstance(Department department) {
        Bundle args = new Bundle();
        ProgramsFragment fragment = new ProgramsFragment();
        String serializedDepartment = department.toJson();

        args.putString(DEPARTMENT_KEY, serializedDepartment);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setData() {
        String serializedDepartment = getArguments().getString(DEPARTMENT_KEY);
        mDepartment = Department.toModel(serializedDepartment, Department.class);
    }

    @Override
    protected int getFragmentTitle() {
        return R.string.fragment_programs;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new ProgramsAdapter(getContext(), mDepartment.getProgramList(), getListener());
    }

    private ProgramsListener getListener() {
        return new ProgramsListener() {
            @Override
            public void onProgramClicked(Program program) {
                goToPeriods(program);
            }
        };
    }

    private void goToPeriods(Program program) {
        PeriodsFragment fragment = PeriodsFragment.newInstance(program);
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
