package com.example.tcc.tccemptyapp.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.tcc.tccemptyapp.R;

/**
 * Created by Alan on 30/09/2016.
 */
public class Placeholder extends LinearLayout {

    private Context mContext;

    public Placeholder(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public Placeholder(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    public void setButtonListener(OnClickListener listener) {
        Button button = (Button) findViewById(R.id.placeholder_button);
        button.setOnClickListener(listener);
    }

    private void init() {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.component_placeholder, this, true);
    }

}
