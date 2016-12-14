package com.example.tcc.tccemptyapp.adapters.news;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.models.news.New;
import com.example.tcc.tccemptyapp.models.news.NewsList;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewViewHolder> {

    private Boolean hasMoreItems = true;
    private Context mContext;
    private NewsList mNewsList;

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

        return new NewViewHolder(view, mContext);
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
