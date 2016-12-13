package com.example.tcc.tccemptyapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.news.NewsAdapter;
import com.example.tcc.tccemptyapp.helpers.ScrollHelper;
import com.example.tcc.tccemptyapp.models.news.NewsList;
import com.example.tcc.tccemptyapp.providers.news.NewsProvider;
import com.example.tcc.tccemptyapp.providers.news.NewsResponse;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private NewsList mNewsList;
    private NewsAdapter mAdapter;
    private boolean shouldLoadMore = true;

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
                mNewsList = newsList;
                setupRecyclerView();
                showContent();
            }

            @Override
            public void onNewsFailure() {
                showPlaceholder();
            }
        });
    }

    private void setupRecyclerView() {
        mAdapter = new NewsAdapter(getContext(), mNewsList);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (shouldLoadMore && ScrollHelper.isScrollOnSecondHalf(linearLayoutManager)) {
                    shouldLoadMore = false;
                    loadMoreNews();
                }
            }
        });
    }

    private void loadMoreNews() {
        new NewsProvider().getNews(mNewsList.getNextPageUrl(), new NewsResponse() {
            @Override
            public void onNewsSuccess(NewsList newsList) {
                mNewsList.updateWithList(newsList);
                mAdapter.notifyDataSetChanged();
                shouldLoadMore = true;
            }

            @Override
            public void onNewsFailure() {
                mAdapter.stopLoad();
                mAdapter.notifyDataSetChanged();
                shouldLoadMore = true;
            }
        });
    }
}
