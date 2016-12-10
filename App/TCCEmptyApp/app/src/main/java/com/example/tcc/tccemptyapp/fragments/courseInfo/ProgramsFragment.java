package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.ProgramsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.ProgramsListener;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
import com.example.tcc.tccemptyapp.models.courseInfo.CourseInfoStructure;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Alan on 21/10/2016.
 */
public class ProgramsFragment extends CourseInfoFragment {

    private static final String NAME_KEY = "name";
    private static final String LIST_KEY = "list";
    private List<Program> mPrograms;

    public static ProgramsFragment newInstance(final String name, final List<Program> programList) {
        Bundle args = new Bundle();
        ProgramsFragment fragment = new ProgramsFragment();
        String serializedList = new Gson().toJson(programList);

        args.putString(NAME_KEY, name);
        args.putString(LIST_KEY, serializedList);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void setParentObjectData() {
        @@@origem_cursos@@@
    }

    @Override
    protected String getFragmentTitle() {
        return @@@titulo@@@;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new ProgramsAdapter(getContext(), mPrograms, getListener());
    }

    private ProgramsListener getListener() {
        return new ProgramsListener() {
            @Override
            public void onProgramClicked(Program program) {
                BaseFragment fragment;

                @@@adapter_click@@@

                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }
}
