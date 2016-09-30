package com.example.tcc.tccemptyapp.fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.tcc.tccemptyapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ADMFragment extends Fragment {

    public ADMFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_adm, container, false);
    }


}
