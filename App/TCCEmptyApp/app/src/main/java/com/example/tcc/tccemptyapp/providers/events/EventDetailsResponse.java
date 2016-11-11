package com.example.tcc.tccemptyapp.providers.events;

import com.example.tcc.tccemptyapp.models.Event;

/**
 * Created by Alan on 11/11/2016.
 */
public interface EventDetailsResponse {
    void onEventDetailsSuccess(Event event);
    void onEventDetailsFailure();
}
