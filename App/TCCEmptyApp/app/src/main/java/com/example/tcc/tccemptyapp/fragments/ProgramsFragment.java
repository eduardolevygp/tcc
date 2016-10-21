package com.example.tcc.tccemptyapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.ProgramsAdapter;
import com.example.tcc.tccemptyapp.adapters.ProgramsListener;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

/**
 * Created by Alan on 21/10/2016.
 */
public class ProgramsFragment extends BaseFragment {

    private static final String DEPARTMENT_KEY = "department";
    private RecyclerView mRecyclerView;
    private Department mDepartment;

    public static ProgramsFragment newInstance(Department department) {
        Bundle args = new Bundle();
        ProgramsFragment fragment = new ProgramsFragment();
        String serializedDepartment = department.toJson();

        args.putString(DEPARTMENT_KEY, serializedDepartment);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_course_info, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_course_info);

        setDepartment();
        getActivity().setTitle(R.string.fragment_programs);
        setupRecyclerView();
    }

    @Override
    protected void onPlaceholderButtonSelected() {}

    private void setDepartment() {
        String serializedDepartment = getArguments().getString(DEPARTMENT_KEY);
        mDepartment = Department.toModel(serializedDepartment, Department.class);
    }

    private void setupRecyclerView() {
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
