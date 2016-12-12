package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

    private Context mContext;
    private NewsList mNewsList;

    public class NewViewHolder extends BaseViewHolder {

        private TextView title, date, message;
        private ImageView picture;

        public NewViewHolder(View view) {
            super(view, mContext);

            setBackground((LinearLayout) view.findViewById(R.id.card_news_background));

            title = (TextView) view.findViewById(R.id.card_news_title);
            date = (TextView) view.findViewById(R.id.card_news_date);
            message = (TextView) view.findViewById(R.id.card_news_message);

            picture = (ImageView) view.findViewById(R.id.card_news_picture);
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

            Picasso.with(mContext)
                    .load(currentNew.getPicture())
                    .placeholder(R.drawable.placeholder_avatar_image)
                    .error(R.drawable.placeholder_avatar_error)
                    .into(picture);
        }
    }

    public NewsAdapter(final Context context, final NewsList newsList) {
        mContext = context;
        mNewsList = newsList;
    }

    @Override
    public int getItemCount() {
        return mNewsList.getData().size();
    }

    @Override
    public NewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_news, parent, false);

        return new NewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewViewHolder holder, int position) {
        New currentNew = mNewsList.getData().get(position);

        holder.setBackgroundColor(position);
        holder.setFields(currentNew);
    }
}
