package com.example.tcc.tccemptyapp.fragments.courseInfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;

/**
 * Created by Alan on 21/10/2016.
 */
public abstract class CourseInfoFragment extends BaseFragment {
    protected RecyclerView mRecyclerView;

    protected abstract void setData();
    protected abstract int getFragmentTitle();
    protected abstract CourseInfoAdapter getAdapter();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_course_info, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_course_info);

        setData();
        getActivity().setTitle(getFragmentTitle());
        setupRecyclerView();
    }

    protected void goToFragment(BaseFragment fragment) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_container, fragment)
                .addToBackStack(null)
                .commit();
    }

    @Override
    protected void onPlaceholderButtonSelected() {}

    private void setupRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(getAdapter());
    }
}
