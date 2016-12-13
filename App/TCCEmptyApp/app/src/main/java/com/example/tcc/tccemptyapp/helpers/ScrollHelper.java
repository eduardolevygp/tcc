package com.example.tcc.tccemptyapp.helpers;

import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by Alan on 12/12/2016.
 */
public class ScrollHelper {
    public static boolean isScrollOnSecondHalf(final LinearLayoutManager manager) {
        int totalItemCount = manager.getItemCount();
        int firstVisibleItemPosition = manager.findFirstVisibleItemPosition();

        return firstVisibleItemPosition > totalItemCount/2;
    }
}
