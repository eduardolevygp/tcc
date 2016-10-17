package com.example.tcc.tccemptyapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.DepartmentsAdapter;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_departments, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_departments);

        setupRecyclerView();
    }

    @Override
    protected void onPlaceholderButtonSelected() {

    }

    private void setupRecyclerView() {
        DepartmentsAdapter adapter = new DepartmentsAdapter(getContext(), getMockDepartments());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private List<Department> getMockDepartments() {
        Department dp1 = new Department();
        dp1.setName("PCS");

        Department dp2 = new Department();
        dp2.setName("PEA");

        Department dp3 = new Department();
        dp3.setName("PTC");

        Department dp4 = new Department();
        dp4.setName("MAC");

        List<Department> departments = new ArrayList<>();
        departments.add(dp1);
        departments.add(dp2);
        departments.add(dp3);
        departments.add(dp4);

        return departments;
    }
}
