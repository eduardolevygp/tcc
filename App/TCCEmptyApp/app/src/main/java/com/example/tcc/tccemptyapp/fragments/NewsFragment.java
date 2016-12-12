package com.example.tcc.tccemptyapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.NewsAdapter;
import com.example.tcc.tccemptyapp.models.news.NewsList;
import com.example.tcc.tccemptyapp.providers.news.NewsProvider;
import com.example.tcc.tccemptyapp.providers.news.NewsResponse;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsFragment extends BaseFragment {

    private RecyclerView mRecyclerView;

    public NewsFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_news, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_news);

        getActivity().setTitle(R.string.fragment_news);
        fetchNews();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchNews();
    }

    private void fetchNews() {
        showLoading();
        new NewsProvider().getNews(new NewsResponse() {
            @Override
            public void onNewsSuccess(NewsList newsList) {
                setupRecyclerView(newsList);
                showContent();
            }

            @Override
            public void onNewsFailure() {
                showPlaceholder();
            }
        });
    }

    private void setupRecyclerView(NewsList newsList) {
        NewsAdapter adapter = new NewsAdapter(getContext(), newsList);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
    }
}
