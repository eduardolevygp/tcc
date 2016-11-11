package com.example.tcc.tccemptyapp.providers.events;

import com.example.tcc.tccemptyapp.constants.APIRoutes;
import com.example.tcc.tccemptyapp.models.Event;
import com.example.tcc.tccemptyapp.providers.general.HttpMethod;
import com.example.tcc.tccemptyapp.providers.general.RequestService;
import com.example.tcc.tccemptyapp.providers.general.ResponseHandler;

import java.util.List;

/**
 * Created by Alan on 11/11/2016.
 */
public class EventsProvider {

    public void getEvents(final EventsResponse handler) {
        new RequestService().performRequest(HttpMethod.GET, APIRoutes.EVENTS_URL, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                List<Event> events = Event.toListModel(jsonResponse, Event.class);
                if (events != null) {
                    handler.onEventsSuccess(events);
                } else {
                    handler.onEventsFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onEventsFailure();
            }
        });
    }

    public void getEventDetails(final String eventId, final EventDetailsResponse handler) {
        String eventDetailsUrl = APIRoutes.EVENTS_URL + "/" + eventId;
        new RequestService().performRequest(HttpMethod.GET, eventDetailsUrl, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                Event event = Event.toModel(jsonResponse, Event.class);
                if (event != null) {
                    handler.onEventDetailsSuccess(event);
                } else {
                    handler.onEventDetailsFailure();
                }
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onEventDetailsFailure();
            }
        });
    }
}
