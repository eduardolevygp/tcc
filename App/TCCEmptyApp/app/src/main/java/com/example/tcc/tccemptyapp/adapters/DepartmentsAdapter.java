package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsAdapter extends RecyclerView.Adapter<CourseInfoViewHolder> {

    private final Context mContext;
    private final List<Department> mDepartments;
    private final DepartmentsListener mListener;

    public DepartmentsAdapter(Context context, List<Department> departments, DepartmentsListener listener) {
        mContext = context;
        mDepartments = departments;
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mDepartments.size();
    }

    @Override
    public CourseInfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_course_info, parent, false);

        return new CourseInfoViewHolder(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(CourseInfoViewHolder holder, int position) {
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