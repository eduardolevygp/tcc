package com.example.tcc.tccemptyapp.adapters.courseInfo;

import android.content.Context;
import android.view.View;
import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public class ProgramsAdapter extends CourseInfoAdapter {

    private final List<Program> mPrograms;
    private final ProgramsListener mListener;

    public ProgramsAdapter(final Context context, final List<Program> programs, final ProgramsListener listener) {
        super(context);
        mPrograms = programs;
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mPrograms.size();
    }

    @Override
    public void onBindViewHolder(CourseInfoViewHolder holder, final int position) {
        final Program program = mPrograms.get(position);

        holder.setText(program.getName());
        holder.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onProgramClicked(program);
            }
        });
    }
}