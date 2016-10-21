package com.example.tcc.tccemptyapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.DepartmentsAdapter;
import com.example.tcc.tccemptyapp.adapters.DepartmentsListener;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_course_info, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_course_info);

        setupRecyclerView();
        getActivity().setTitle(R.string.fragment_departments);
    }

    @Override
    protected void onPlaceholderButtonSelected() {}

    private void setupRecyclerView() {
        DepartmentsAdapter adapter = new DepartmentsAdapter(getContext(), getMockDepartments(), getDepartmentsListener());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private DepartmentsListener getDepartmentsListener() {
        return new DepartmentsListener() {
            @Override
            public void onDepartmentClick(Department department) {
                goToPrograms(department);
            }
        };
    }

    private void goToPrograms(Department department) {
        ProgramsFragment fragment = ProgramsFragment.newInstance(department);
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_activity_container, fragment).addToBackStack(null).commit();
    }

    private List<Department> getMockDepartments() {
        Department dp1 = new Department();
        dp1.setName("PCS");
        dp1.setProgramList(getMockPrograms(1));

        Department dp2 = new Department();
        dp2.setName("PEA");
        dp2.setProgramList(getMockPrograms(2));

        Department dp3 = new Department();
        dp3.setName("PTC");
        dp3.setProgramList(getMockPrograms(3));

        Department dp4 = new Department();
        dp4.setName("MAC");
        dp4.setProgramList(getMockPrograms(4));

        List<Department> departments = new ArrayList<>();
        departments.add(dp1);
        departments.add(dp2);
        departments.add(dp3);
        departments.add(dp4);

        return departments;
    }

    private List<Program> getMockPrograms(int position) {
        Program program1 = new Program();
        Program program2 = new Program();
        Program program3 = new Program();
        Program program4 = new Program();
        List<Program> programs = new ArrayList<>();

        if (position == 1) {
            program1.setName("Engenharia da Computação");
            program2.setName("Engenharia da Sistemas Digitais");
            programs.addAll(Arrays.asList(program1, program2));
        } else if (position == 2) {
            program1.setName("Engenharia de Automação");
            program2.setName("Engenharia de Controle");
            programs.addAll(Arrays.asList(program1, program2));
        } else if (position == 3) {
            program1.setName("Engenharia da Telecomunicações");
            programs.add(program1);
        } else if (position == 4) {
            program1.setName("Engenharia de Computação");
            program2.setName("Engenharia de Automação");
            program3.setName("Engenharia de Telecomunicações");
            program4.setName("Engenharia de Sistemas Digitais");
            programs.addAll(Arrays.asList(program1, program2, program3, program4));
        }

        return programs;
    }
}
