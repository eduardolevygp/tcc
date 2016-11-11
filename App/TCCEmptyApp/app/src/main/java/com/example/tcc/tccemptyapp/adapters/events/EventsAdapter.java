package com.example.tcc.tccemptyapp.adapters.events;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.BaseViewHolder;
import com.example.tcc.tccemptyapp.models.Event;

import java.util.List;

/**
 * Created by Alan on 11/11/2016.
 */
public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventViewHolder> {

    private Context mContext;
    private List<Event> mEvents;
    private EventsListener mListener;

    public class EventViewHolder extends BaseViewHolder {
        private TextView title, dateTime, location;

        public EventViewHolder(View view) {
            super(view, mContext);

            setBackground((LinearLayout) view.findViewById(R.id.card_event_background));
            title = (TextView) view.findViewById(R.id.card_event_title);
            dateTime = (TextView) view.findViewById(R.id.card_event_date_time);
            location = (TextView) view.findViewById(R.id.card_event_location);
        }

        @Override
        protected void setTextColors(int colorCode) {
            title.setTextColor(colorCode);
            dateTime.setTextColor(colorCode);
            location.setTextColor(colorCode);
        }

        public void setFields(Event event) {
            title.setText(event.getTitle());
            dateTime.setText(event.getDateAndTime());
            location.setText(event.getLocation());
        }
    }

    public EventsAdapter(final Context context, final List<Event> events, final EventsListener listener) {
        mContext = context;
        mEvents = events;
        mListener = listener;
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
        final Event event = mEvents.get(position);

        holder.setFields(event);
        holder.setBackgroundColor(position);
        holder.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onEventSelected(event);
            }
        });
    }
}
