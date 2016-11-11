package com.example.tcc.tccemptyapp.fragments.events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.events.EventsAdapter;
import com.example.tcc.tccemptyapp.adapters.events.EventsListener;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
import com.example.tcc.tccemptyapp.models.Event;
import com.example.tcc.tccemptyapp.providers.events.EventsProvider;
import com.example.tcc.tccemptyapp.providers.events.EventsResponse;

import java.util.List;

/**
 * Created by Alan on 11/11/2016.
 */
public class EventsFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    public EventsFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_events, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_events);

        getActivity().setTitle(R.string.fragment_events_title);
        fetchEvents();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchEvents();
    }

    private void fetchEvents() {
        showLoading();

        new EventsProvider().getEvents(new EventsResponse() {
            @Override
            public void onEventsSuccess(List<Event> events) {
                setupRecyclerView(events);
                showContent();
            }

            @Override
            public void onEventsFailure() {
                showPlaceholder();
            }
        });
    }

    private void setupRecyclerView(List<Event> events) {
        EventsAdapter adapter = new EventsAdapter(getContext(), events, getListener());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private EventsListener getListener() {
        return new EventsListener() {
            @Override
            public void onEventSelected(Event event) {
                EventDetailsFragment fragment = EventDetailsFragment.newInstance(event.getId());
                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }
}
