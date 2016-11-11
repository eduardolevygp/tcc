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
import com.example.tcc.tccemptyapp.models.Event;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Alan on 11/11/2016.
 */
public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventViewHolder> {
    private Context mContext;
    private List<Event> mEvents;

    public class EventViewHolder extends BaseViewHolder {
        private TextView title, dateTime, location, description;
        private ImageView image;

        public EventViewHolder(View view) {
            super(view, mContext);

            setBackground((LinearLayout) view.findViewById(R.id.card_event_background));
            image = (ImageView) view.findViewById(R.id.card_event_image);
            title = (TextView) view.findViewById(R.id.card_event_title);
            dateTime = (TextView) view.findViewById(R.id.card_event_date_time);
            location = (TextView) view.findViewById(R.id.card_event_location);
            description = (TextView) view.findViewById(R.id.card_event_description);
        }

        @Override
        protected void setTextColors(int colorCode) {
            title.setTextColor(colorCode);
            dateTime.setTextColor(colorCode);
            location.setTextColor(colorCode);
            description.setTextColor(colorCode);
        }

        public void setFields(Event event) {
            title.setText(event.getTitle());
            dateTime.setText(event.getDateAndTime());
            location.setText(event.getLocation());
            description.setText(event.getDescription());

            Picasso.with(mContext)
                    .load(event.getImageUrl())
                    .placeholder(R.drawable.placeholder_avatar_image)
                    .error(R.drawable.placeholder_avatar_error)
                    .into(image);
        }

    }

    public EventsAdapter(Context context, List<Event> events) {
        mContext = context;
        mEvents = events;
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_event, parent, false);
        return new EventViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        Event event = mEvents.get(position);

        holder.setFields(event);
        holder.setBackgroundColor(position);
    }
}
