package com.example.tcc.tccemptyapp.components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;

/**
 * Created by Alan on 21/10/2016.
 */
public class CourseInfoViewHolder extends BaseViewHolder {

    private TextView textView;

    public CourseInfoViewHolder(View view, Context context) {
        super(view, context);

        setBackground((LinearLayout) view.findViewById(R.id.card_course_info_background));
        textView = (TextView) view.findViewById(R.id.card_course_info_text);
    }

    @Override
    protected void setTextColors(int colorCode) {}

    public void setText(String text) {
        textView.setText(text);
    }
}
