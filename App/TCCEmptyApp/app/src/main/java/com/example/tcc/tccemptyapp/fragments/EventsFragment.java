package com.example.tcc.tccemptyapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.EventsAdapter;
import com.example.tcc.tccemptyapp.models.Event;

import java.util.ArrayList;
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
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        EventsAdapter adapter = new EventsAdapter(getContext(), getMockEvents());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }

    private List<Event> getMockEvents() {
        List<Event> events = new ArrayList<>();

        Event event = new Event();
        event.setTitle("Copa Zeus");
        event.setDate("Dia 20 de novembro");
        event.setTime("a partir das 8h");
        event.setLocation("Centro da Engenharia Elétrica");
        event.setDescription("A Copa Zeus é um campeonato de games em geral em que qualquer aluno da Escola Politécnica pode participar.\\nTraga seus amigos e escolha suas modalidades!");

        events.add(event);
        events.add(event);

        return events;
    }
}
