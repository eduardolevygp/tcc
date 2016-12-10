package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.PeriodsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.PeriodsListener;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
import com.example.tcc.tccemptyapp.models.courseInfo.CourseInfoStructure;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;
import com.google.gson.Gson;

import java.util.List;


/**
 * Created by Alan on 21/10/2016.
 */
public class PeriodsFragment extends CourseInfoFragment {

    private static final String NAME_KEY = "name";
    private static final String LIST_KEY = "list";
    private List<Period> mPeriods;

    public static PeriodsFragment newInstance(final String name, final List<Period> periods) {
        Bundle args = new Bundle();
        PeriodsFragment fragment = new PeriodsFragment();
        String jsonList = new Gson().toJson(periods);

        args.putString(NAME_KEY, name);
        args.putString(LIST_KEY, jsonList);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setParentObjectData() {
        @@@periods@@@
    }

    @Override
    protected String getFragmentTitle() {
        return @@@titulo@@@;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new PeriodsAdapter(getContext(), mPeriods, getListener());
    }

    private PeriodsListener getListener() {
        return new PeriodsListener() {
            @Override
            public void onPeriodClicked(Period period) {
                CoursesFragment fragment = CoursesFragment.newInstance(period.getId(), period.getName());
                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }
}
