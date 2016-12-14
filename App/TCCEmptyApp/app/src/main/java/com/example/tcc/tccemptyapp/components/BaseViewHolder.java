package com.example.tcc.tccemptyapp.components;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.tcc.tccemptyapp.R;

/**
 * Created by Alan on 21/10/2016.
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    protected LinearLayout background;
    private final Context mContext;

    public BaseViewHolder(View view, Context context) {
        super(view);
        mContext = context;
    }

    protected abstract void setTextColors(int colorCode);

    protected void setBackground(LinearLayout background) {
        this.background = background;
    }

    public void setClickListener(final View.OnClickListener listener) {
        this.background.setOnClickListener(listener);
    }

    public void setBackgroundColor(int position) {
        int color, textColor;

        if (position % 2 == 0) {
            color = R.color.color_primary;
            textColor = R.color.color_primary_contrast;
        } else {
            color = R.color.color_secondary;
            textColor = R.color.color_secondary_contrast;
        }

        setTextColors(ContextCompat.getColor(mContext, textColor));
        background.setBackgroundColor(ContextCompat.getColor(mContext, color));
    }
}
