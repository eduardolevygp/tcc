package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.PeriodsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.PeriodsListener;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;


/**
 * Created by Alan on 21/10/2016.
 */
public class PeriodsFragment extends CourseInfoFragment {

    private static final String PROGRAM_KEY = "program";
    private Program mProgram;

    public static PeriodsFragment newInstance(final Program program) {
        Bundle args = new Bundle();
        PeriodsFragment fragment = new PeriodsFragment();
        String jsonProgram = program.toJson();

        args.putString(PROGRAM_KEY, jsonProgram);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setData() {
        String jsonProgram = getArguments().getString(PROGRAM_KEY);
        mProgram = Program.toModel(jsonProgram, Program.class);
    }

    @Override
    protected int getFragmentTitle() {
        return R.string.fragment_period;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new PeriodsAdapter(getContext(), mProgram.getPeriodList(), getListener());
    }

    private PeriodsListener getListener() {
        return new PeriodsListener() {
            @Override
            public void onPeriodClicked(Period period) {
                CoursesFragment fragment = CoursesFragment.newInstance(period);
                goToFragment(fragment);
            }
        };
    }
}
