package com.example.tcc.tccemptyapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tcc.tccemptyapp.fragments.ADMFragment;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.fragments.courseInfo.DepartmentsFragment;
import com.example.tcc.tccemptyapp.fragments.HomeFragment;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;
import com.example.tcc.tccemptyapp.models.courseInfo.CourseDetail;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseDetailResponse;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseInfoProvider;
import com.example.tcc.tccemptyapp.providers.courseInfo.CourseListResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private int mCurrentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setupHomeFragment();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id != mCurrentFragment) {
           openFragment(id);
            mCurrentFragment = id;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void openFragment(int id) {
        Toast toast;
        BaseFragment fragment;

        if (id == R.id.nav_adm) {
            fragment = new ADMFragment();
            replaceTransition(fragment);
        } else if (id == R.id.nav_disciplines) {
            fragment = new DepartmentsFragment();
            replaceTransition(fragment);
        } else if (id == R.id.nav_events) {
            toast = Toast.makeText(this, "Eventos selecionado", Toast.LENGTH_SHORT);
            toast.show();
        } else if (id == R.id.nav_news) {
            toast = Toast.makeText(this, "Notícias selecionado", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private void replaceTransition(Fragment fragment) {
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_activity_container, fragment)
                .commit();
    }

    private void setupHomeFragment() {
        HomeFragment fragment = new HomeFragment();

        getSupportFragmentManager().beginTransaction()
            .add(R.id.main_activity_container, fragment)
                .commit();
    }

}
