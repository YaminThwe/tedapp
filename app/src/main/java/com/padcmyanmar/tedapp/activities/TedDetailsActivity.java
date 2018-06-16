package com.padcmyanmar.tedapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.padcmyanmar.tedapp.R;
import com.padcmyanmar.tedapp.adapters.WatchNextAdapter;

public class TedDetailsActivity extends BaseActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted_details);


        RecyclerView rvWatch = findViewById(R.id.rv_ted_watch_next);
        WatchNextAdapter watchnextadapter = new WatchNextAdapter();
        rvWatch.setAdapter(watchnextadapter);
        rvWatch.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL, false));
    }
}
