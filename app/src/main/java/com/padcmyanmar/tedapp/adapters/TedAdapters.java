package com.padcmyanmar.tedapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.tedapp.activities.TedListActivity;
import com.padcmyanmar.tedapp.delegates.TedTalkDelegates;
import com.padcmyanmar.tedapp.R;
import com.padcmyanmar.tedapp.viewholders.TedViewHolders;

public class TedAdapters extends RecyclerView.Adapter
{
    private TedTalkDelegates tednextDelegate;
    public TedAdapters(TedListActivity newDelegate)
    {
        tednextDelegate=  newDelegate;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        LayoutInflater layoutinfalter= LayoutInflater.from(parent.getContext());
        View view=layoutinfalter.inflate(R.layout.view_holder_ted,parent,false);
        return new TedViewHolders(view,tednextDelegate);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {


    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
