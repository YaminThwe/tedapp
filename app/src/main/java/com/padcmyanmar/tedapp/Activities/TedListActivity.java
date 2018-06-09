package com.padcmyanmar.tedapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.padcmyanmar.tedapp.Delegates.TedTalkDelegates;
import com.padcmyanmar.tedapp.R;
import com.padcmyanmar.tedapp.adapters.TedAdapters;

public class TedListActivity extends BaseActivity implements TedTalkDelegates
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tedapp);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rvTeds = findViewById(R.id.rv_ted);
        TedAdapters tedadapter=new TedAdapters(this);
        rvTeds.setAdapter(tedadapter);
        rvTeds.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayout.VERTICAL, false));

    }

    @Override
    public void onTapNews()
    {
        Intent intent = new Intent(getApplicationContext(),TedDetailsActivity.class);
        startActivity(intent);
    }
}
