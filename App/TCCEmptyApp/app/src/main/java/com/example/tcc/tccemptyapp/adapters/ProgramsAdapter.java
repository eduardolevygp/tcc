package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public class ProgramsAdapter extends RecyclerView.Adapter<CourseInfoViewHolder> {

    private final Context mContext;
    private final List<Program> mPrograms;
    private final ProgramsListener mListener;

    public ProgramsAdapter(Context context, List<Program> programs, ProgramsListener listener) {
        mContext = context;
        mPrograms = programs;
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mPrograms.size();
    }

    @Override
    public CourseInfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.card_view_course_info, parent, false);

        return new CourseInfoViewHolder(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(CourseInfoViewHolder holder, int position) {
        final Program program = mPrograms.get(position);

        holder.setText(program.getName());
        holder.getBackground().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onProgramClicked(program);
            }
        });
    }
}