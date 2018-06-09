package com.padcmyanmar.tedapp.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.tedapp.Delegates.TedTalkDelegates;

public class TedViewHolders extends RecyclerView.ViewHolder
{
    private TedTalkDelegates TedWatchNextDelegate;

    public TedViewHolders(View itemView,TedTalkDelegates tedWatchNextDelegate)
    {
        super(itemView);
        TedWatchNextDelegate=tedWatchNextDelegate;
        itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                TedWatchNextDelegate.onTapNews();
            }
        });
    }
}
