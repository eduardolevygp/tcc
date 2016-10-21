package com.example.tcc.tccemptyapp.adapters.courseInfo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;

/**
 * Created by Alan on 21/10/2016.
 */
public abstract class CourseInfoAdapter extends RecyclerView.Adapter<CourseInfoViewHolder> {

    private Context mContext;

    protected CourseInfoAdapter(Context context) {
        mContext = context;
    }

    @Override
    public CourseInfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.card_view_course_info, parent, false);

        return new CourseInfoViewHolder(itemView, mContext);
    }
}
