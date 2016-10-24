package com.example.tcc.tccemptyapp.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tcc.tccemptyapp.R;

/**
 * Created by Alan on 23/10/2016.
 */
public class PlaceholderEmptyList extends LinearLayout {
    private Context mContext;

    public PlaceholderEmptyList(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public PlaceholderEmptyList(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public PlaceholderEmptyList(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    public void setButtonListener(OnClickListener listener) {
        Button button = (Button) findViewById(R.id.placeholder_empty_list_button);
        button.setOnClickListener(listener);
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.component_placeholder_empty_list, this, true);
    }
}
