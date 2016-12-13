package com.example.tcc.tccemptyapp.adapters.news;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.BaseViewHolder;
import com.example.tcc.tccemptyapp.models.news.New;
import com.squareup.picasso.Picasso;

/**
 * Created by Alan on 13/12/2016.
 */
public class NewViewHolder extends BaseViewHolder {

    private Context mContext;
    private New mNew;
    private TextView title, date, message, link;
    private ImageView picture;
    private ProgressBar progress;

    public NewViewHolder(View view, Context context) {
        super(view, context);

        mContext = context;
        setBackground((LinearLayout) view.findViewById(R.id.card_news_background));
        title = (TextView) view.findViewById(R.id.card_news_title);
        date = (TextView) view.findViewById(R.id.card_news_date);
        message = (TextView) view.findViewById(R.id.card_news_message);
        link = (TextView) view.findViewById(R.id.card_news_link);
        picture = (ImageView) view.findViewById(R.id.card_news_picture);
        progress = (ProgressBar) view.findViewById(R.id.card_news_progress_bar);
    }

    @Override
    protected void setTextColors(int colorCode) {
        title.setTextColor(colorCode);
        date.setTextColor(colorCode);
        message.setTextColor(colorCode);
        link.setTextColor(colorCode);
    }

    public void setFields(New currentNew) {
        mNew = currentNew;

        date.setText(currentNew.getDate());
        message.setText(currentNew.getMessage());
        setLink();
        setPicture();
    }

    public void showLoading() {
        background.setVisibility(View.GONE);
        progress.setVisibility(View.VISIBLE);
    }

    public void setCellClickListener(final View.OnClickListener listener) {
        background.setOnClickListener(listener);
    }

    public void showContent() {
        background.setVisibility(View.VISIBLE);
        progress.setVisibility(View.GONE);
    }

    private void setPicture() {
        if (mNew.getPicture() != null) {
            picture.setVisibility(View.VISIBLE);
            Picasso.with(mContext)
                    .load(mNew.getPicture())
                    .placeholder(R.drawable.placeholder_image_general)
                    .error(R.drawable.placeholder_avatar_error)
                    .into(picture);
        } else {
            picture.setVisibility(View.GONE);
        }
    }

    private void setLink() {
        if (mNew.getLink() == null) {
            link.setVisibility(View.GONE);
        } else {
            link.setText(mNew.getLink());
            link.setPaintFlags(link.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
            link.setOnClickListener(getLinkClickListener());
            link.setVisibility(View.VISIBLE);
        }
    }

    private View.OnClickListener getLinkClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mNew.getLink() != null) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mNew.getLink()));
                    mContext.startActivity(browserIntent);
                }
            }
        };
    }
}
