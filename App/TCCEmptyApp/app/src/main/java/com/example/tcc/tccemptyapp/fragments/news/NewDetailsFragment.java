package com.example.tcc.tccemptyapp.fragments.news;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.models.news.New;
import com.example.tcc.tccemptyapp.models.news.NewsList;
import com.example.tcc.tccemptyapp.providers.news.NewDetailsResponse;
import com.example.tcc.tccemptyapp.providers.news.NewsProvider;
import com.squareup.picasso.Picasso;


/**
 * Created by Alan on 13/12/2016.
 */
public class NewDetailsFragment extends BaseFragment {

    private static final String ID_KEY = "idKey";

    private New mNewDetails;
    private TextView date, message, link;
    private ImageView picture;

    public static NewDetailsFragment newInstance(String newId) {
        Bundle args = new Bundle();
        NewDetailsFragment fragment = new NewDetailsFragment();

        args.putString(ID_KEY, newId);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_new_details, inflater, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        date = (TextView) view.findViewById(R.id.new_details_date);
        message = (TextView) view.findViewById(R.id.new_details_message);
        link = (TextView) view.findViewById(R.id.new_details_link);
        picture = (ImageView) view.findViewById(R.id.new_details_picture);

        fetchNewDetails();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        fetchNewDetails();
    }

    private void fetchNewDetails() {
        showLoading();
        new NewsProvider().getNewsDetail(getArguments().getString(ID_KEY), new NewDetailsResponse() {
            @Override
            public void onNewDetailsSuccess(New newDetails) {
                mNewDetails = newDetails;
                date.setText(newDetails.getDate());
                message.setText(newDetails.getMessage());
                setLink();
                setImage();

                showContent();
            }

            @Override
            public void onNewDetailsFailure() {
                showPlaceholder();
            }
        });
    }

    private void setLink() {
        if (mNewDetails.getLink() == null) {
            link.setVisibility(View.GONE);
            return;
        }

        link.setText(mNewDetails.getLink());
        link.setPaintFlags(link.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mNewDetails.getLink()));
                getContext().startActivity(browserIntent);
            }
        });
    }

    private void setImage() {
        if (mNewDetails.getPicture() != null) {
            picture.setVisibility(View.VISIBLE);
            Picasso.with(getContext())
                    .load(mNewDetails.getPicture())
                    .placeholder(R.drawable.placeholder_image_general)
                    .error(R.drawable.placeholder_avatar_error)
                    .into(picture);
        } else {
            picture.setVisibility(View.GONE);
        }
    }
}
