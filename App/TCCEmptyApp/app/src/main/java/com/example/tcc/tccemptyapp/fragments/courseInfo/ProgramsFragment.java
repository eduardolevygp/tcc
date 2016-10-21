package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.ProgramsAdapter;
import com.example.tcc.tccemptyapp.adapters.ProgramsListener;
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
    protected void setupRecyclerView() {
        Context context = getContext();
        ProgramsAdapter adapter = new ProgramsAdapter(context, mDepartment.getProgramList(), getListener());

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private ProgramsListener getListener() {
        return new ProgramsListener() {
            @Override
            public void onProgramClicked(Program program) {
                int a = 3;
            }
        };
    }
}
