package com.example.tcc.tccemptyapp.fragments.events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.models.Event;
import com.example.tcc.tccemptyapp.providers.events.EventDetailsResponse;
import com.example.tcc.tccemptyapp.providers.events.EventsProvider;
import com.squareup.picasso.Picasso;


/**
 * Created by Alan on 11/11/2016.
 */
public class EventDetailsFragment extends BaseFragment {

    private static String EVENT_ID_KEY = "eventId";
    private ImageView mImage;
    private TextView mTitle;
    private TextView mDateTime;
    private TextView mLocation;
    private TextView mDescription;

    private String mEventId;
    private Event mEvent;

    public static EventDetailsFragment newInstance(String id) {
        Bundle args = new Bundle();
        EventDetailsFragment fragment = new EventDetailsFragment();

        args.putString(EVENT_ID_KEY, id);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_event_detail, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mImage = (ImageView) view.findViewById(R.id.event_detail_image);
        mTitle = (TextView) view.findViewById(R.id.event_detail_title);
        mDateTime = (TextView) view.findViewById(R.id.event_detail_date_time);
        mLocation = (TextView) view.findViewById(R.id.event_detail_location);
        mDescription = (TextView) view.findViewById(R.id.event_detail_description);
        mEventId = getArguments().getString(EVENT_ID_KEY);

        getActivity().setTitle(R.string.fragment_event_details);
        fetchDetails();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchDetails();
    }

    private void fetchDetails() {
        showLoading();

        new EventsProvider().getEventDetails(mEventId, new EventDetailsResponse() {
            @Override
            public void onEventDetailsSuccess(Event event) {
                mEvent = event;
                setFields();
                setImage();
                showContent();
            }

            @Override
            public void onEventDetailsFailure() {
                showPlaceholder();
            }
        });
    }

    private void setFields() {
        mTitle.setText(mEvent.getTitle());
        mDateTime.setText(mEvent.getDateAndTime());
        mLocation.setText(mEvent.getLocation());
        mDescription.setText(mEvent.getDescription());
    }

    private void setImage() {
        Picasso.with(getContext())
                .load(mEvent.getImageUrl())
                .placeholder(R.drawable.placeholder_image_general)
                .error(R.drawable.placeholder_avatar_error)
                .into(mImage);
    }
}
