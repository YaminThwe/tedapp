package com.padcmyanmar.tedapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.tedapp.R;
import com.padcmyanmar.tedapp.viewholders.TedViewHolders;
import com.padcmyanmar.tedapp.viewholders.WatchNextViewHolder;

public class WatchNextAdapter extends RecyclerView.Adapter<WatchNextViewHolder>
{

    @NonNull
    @Override
    public WatchNextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutinfalter= LayoutInflater.from(parent.getContext());
        View view=layoutinfalter.inflate(R.layout.activity_watch_next_view_holder,parent,false);
        return new WatchNextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WatchNextViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
