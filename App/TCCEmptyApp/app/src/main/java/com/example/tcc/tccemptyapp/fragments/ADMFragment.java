package com.example.tcc.tccemptyapp.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.ADMAdapter;
import com.example.tcc.tccemptyapp.models.ManagementMember;
import com.example.tcc.tccemptyapp.providers.adm.ADMProvider;
import com.example.tcc.tccemptyapp.providers.adm.ADMResponse;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ADMFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    public ADMFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_adm, inflater, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.adm_recycler);

        fetchMembers();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchMembers();
    }

    private void fetchMembers() {
        showLoading();
        new ADMProvider().getADMMembers(new ADMResponse() {
            @Override
            public void onADMSuccess(List<ManagementMember> members) {
                setupRecyclerView(members);
                showContent();
            }

            @Override
            public void onADMFailure() {
                showPlaceholder();
            }
        });
     }

    private void setupRecyclerView(List<ManagementMember> members) {
        ADMAdapter adapter = new ADMAdapter(getContext(), members);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }
}
