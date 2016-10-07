package com.example.tcc.tccemptyapp.fragments;


import android.content.res.Resources;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.tcc.tccemptyapp.R;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private TextView mWelcomeTextField;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mWelcomeTextField = (TextView) view.findViewById(R.id.home_welcome_text_view);
        setWelcomeTextView();
    }

    private void setWelcomeTextView() {
        Resources res = getResources();
        String welcomeString = String.format(res.getString(R.string.home_welcome), res.getString(R.string.academic_center_name_initials));

        mWelcomeTextField.setText(welcomeString);
    }
}
