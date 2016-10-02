package com.example.tcc.tccemptyapp.fragments;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.Placeholder;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {
    
    private Placeholder mPlaceholder;
    private FrameLayout mContentContainer;
    private ProgressBar mLoadingView;

    public BaseFragment() {
        // Required empty public constructor
    }

    protected abstract void onPlaceholderButtonSelected();

    protected View inflateFragment(int resId, LayoutInflater inflater, ViewGroup container) {
        View rootView = inflater.inflate(R.layout.fragment_base, container, false);
        View contentView = inflater.inflate(resId, container, false);

        mContentContainer = (FrameLayout) rootView.findViewById(R.id.base_fragment_content);
        mLoadingView = (ProgressBar) rootView.findViewById(R.id.base_fragment_load);
        mPlaceholder = (Placeholder) rootView.findViewById(R.id.base_fragment_placeholder);
        setPlaceholderButtonListener();

        mContentContainer.addView(contentView);

        return rootView;
    }

    protected void showContent() {
        mContentContainer.setVisibility(View.VISIBLE);
        mPlaceholder.setVisibility(View.INVISIBLE);
        mLoadingView.setVisibility(View.INVISIBLE);
    }

    protected void showPlaceholder() {
        mContentContainer.setVisibility(View.INVISIBLE);
        mPlaceholder.setVisibility(View.VISIBLE);
        mLoadingView.setVisibility(View.INVISIBLE);
    }

    protected void showLoading() {
        mContentContainer.setVisibility(View.INVISIBLE);
        mPlaceholder.setVisibility(View.INVISIBLE);
        mLoadingView.setVisibility(View.VISIBLE);
    }

    private void setPlaceholderButtonListener() {
        mPlaceholder.setButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPlaceholderButtonSelected();
            }
        });
    }
}
