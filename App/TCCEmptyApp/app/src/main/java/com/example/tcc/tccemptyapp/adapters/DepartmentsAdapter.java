package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsAdapter extends RecyclerView.Adapter<DepartmentsAdapter.DepartmentsViewHolder> {

    private Context mContext;
    private List<Department> mDepartments;

    public class DepartmentsViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout background;
        private TextView textView;

        public DepartmentsViewHolder(View view) {
            super(view);

            background = (LinearLayout) view.findViewById(R.id.card_course_info_background);
            textView = (TextView) view.findViewById(R.id.card_course_info_text);

            background.setBackgroundColor(ContextCompat.getColor(mContext, R.color.color_primary));
        }
    }

    public DepartmentsAdapter(Context context, List<Department> departments) {
        mContext = context;
        mDepartments = departments;
    }

    @Override
    public int getItemCount() {
        return mDepartments.size();
    }

    @Override
    public DepartmentsAdapter.DepartmentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_course_info, parent, false);

        return new DepartmentsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DepartmentsViewHolder holder, int position) {
        Department department = mDepartments.get(position);
        holder.textView.setText(department.getName());
    }
}