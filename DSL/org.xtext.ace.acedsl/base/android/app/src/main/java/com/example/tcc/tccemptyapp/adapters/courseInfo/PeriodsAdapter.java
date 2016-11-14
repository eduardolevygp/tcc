package com.example.tcc.tccemptyapp.adapters.courseInfo;

import android.content.Context;
import android.view.View;

import com.example.tcc.tccemptyapp.components.CourseInfoViewHolder;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public class PeriodsAdapter extends CourseInfoAdapter {

    private final List<Period> mPeriods;
    private final PeriodsListener mListener;

    public PeriodsAdapter(final Context context, final List<Period> periods, final PeriodsListener listener) {
        super(context);
        mPeriods = periods;
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mPeriods.size();
    }

    @Override
    public void onBindViewHolder(CourseInfoViewHolder holder, int position) {
        final Period period = mPeriods.get(position);

        holder.setText(period.getName());
        holder.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onPeriodClicked(period);
            }
        });
    }
}
