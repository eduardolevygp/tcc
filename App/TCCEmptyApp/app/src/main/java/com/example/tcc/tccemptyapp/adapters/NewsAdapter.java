package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.BaseViewHolder;
import com.example.tcc.tccemptyapp.models.news.New;
import com.example.tcc.tccemptyapp.models.news.NewsList;
import com.squareup.picasso.Picasso;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewViewHolder> {

    private Boolean hasMoreItems = true;
    private Context mContext;
    private NewsList mNewsList;

    public class NewViewHolder extends BaseViewHolder {

        private TextView title, date, message;
        private ImageView picture;
        private ProgressBar progress;

        public NewViewHolder(View view) {
            super(view, mContext);

            setBackground((LinearLayout) view.findViewById(R.id.card_news_background));

            title = (TextView) view.findViewById(R.id.card_news_title);
            date = (TextView) view.findViewById(R.id.card_news_date);
            message = (TextView) view.findViewById(R.id.card_news_message);
            picture = (ImageView) view.findViewById(R.id.card_news_picture);

            progress = (ProgressBar) view.findViewById(R.id.card_news_progress_bar);
        }

        @Override
        protected void setTextColors(int colorCode) {
            title.setTextColor(colorCode);
            date.setTextColor(colorCode);
            message.setTextColor(colorCode);
        }

        private void setFields(New currentNew) {
            title.setText(currentNew.getTitle());
            date.setText(currentNew.getDate());
            message.setText(currentNew.getMessage());
            message.setMovementMethod(LinkMovementMethod.getInstance());
            setPicture(currentNew);
            background.setOnClickListener(getClickListener(currentNew));
            message.setOnClickListener(getClickListener(currentNew));
        }

        private void setPicture(New currentNew) {
            if (currentNew.getPicture() != null) {
                picture.setVisibility(View.VISIBLE);
                Picasso.with(mContext)
                        .load(currentNew.getPicture())
                        .placeholder(R.drawable.placeholder_image_general)
                        .error(R.drawable.placeholder_avatar_error)
                        .into(picture);
            } else {
                picture.setVisibility(View.GONE);
            }
        }

        private void showLoading() {
            background.setVisibility(View.GONE);
            progress.setVisibility(View.VISIBLE);
        }

        private void showContent() {
            background.setVisibility(View.VISIBLE);
            progress.setVisibility(View.GONE);
        }

        private View.OnClickListener getClickListener(final New currentNew) {
            return new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (currentNew.getLink() != null) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentNew.getLink()));
                        mContext.startActivity(browserIntent);
                    }
                }
            };
        }
    }

    public NewsAdapter(final Context context, final NewsList newsList) {
        mContext = context;
        mNewsList = newsList;
    }

    public void stopLoad() {
        hasMoreItems = false;
    }

    @Override
    public int getItemCount() {
        int items = mNewsList.getData().size();
        return hasMoreItems ? items + 1 : items;
    }

    @Override
    public NewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_news, parent, false);

        return new NewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewViewHolder holder, int position) {
        if (isNotLastPosition(position)) {
            New currentNew = mNewsList.getData().get(position);

            holder.setBackgroundColor(position);
            holder.setFields(currentNew);
            holder.showContent();
        } else {
            holder.showLoading();
        }
    }

    private Boolean isNotLastPosition(int position) {
        return position != mNewsList.getData().size();
    }
}
