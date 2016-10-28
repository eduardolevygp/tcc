package com.example.tcc.tccemptyapp.adapters.courseInfo;

import android.content.Context;
import android.view.View;

import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsAdapter extends CourseInfoAdapter {

    private final List<Department> mDepartments;
    private final DepartmentsListener mListener;

    public DepartmentsAdapter(Context context, List<Department> departments, DepartmentsListener listener) {
        super(context);
        mDepartments = departments;
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mDepartments.size();
    }

    @Override
    public void onBindViewHolder(CourseInfoViewHolder holder, final int position) {
        final Department department = mDepartments.get(position);

        holder.setText(department.getName());
        holder.getBackground().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onDepartmentClick(department);
            }
        });
    }
}