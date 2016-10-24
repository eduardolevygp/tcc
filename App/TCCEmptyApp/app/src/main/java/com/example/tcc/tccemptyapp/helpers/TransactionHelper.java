package com.example.tcc.tccemptyapp.helpers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.example.tcc.tccemptyapp.R;

/**
 * Created by Alan on 23/10/2016.
 */
public class TransactionHelper {

    public static void pushFragment(FragmentActivity activity, int id, Fragment fragment) {
        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
