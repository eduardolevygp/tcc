package com.example.tcc.tccemptyapp.providers.events;

import com.example.tcc.tccemptyapp.models.Event;

import java.util.List;

/**
 * Created by Alan on 11/11/2016.
 */
public interface EventsResponse {
    void onEventsSuccess(List<Event> events);
    void onEventsFailure();
}
