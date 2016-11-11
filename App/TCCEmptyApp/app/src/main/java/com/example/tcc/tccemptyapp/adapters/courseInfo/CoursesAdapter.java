package com.example.tcc.tccemptyapp.adapters.courseInfo;

import android.content.Context;
import android.view.View;

import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public class CoursesAdapter extends CourseInfoAdapter {

    private final List<Course> mCourses;
    private CoursesListener mListener;

    public CoursesAdapter(Context context, List<Course> courses, CoursesListener listener) {
        super(context);
        mCourses = courses;
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mCourses.size();
    }

    @Override
    public void onBindViewHolder(final CourseInfoViewHolder holder, final int position) {
        final Course course = mCourses.get(position);

        holder.setText(course.getName());
        holder.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onCourseClicked(course);
            }
        });
    }
}
