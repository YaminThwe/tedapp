package com.padcmyanmar.tedapp.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.tedapp.delegates.TedTalkDelegates;

public class TedViewHolders extends RecyclerView.ViewHolder
{
    private TedTalkDelegates mTedWatchNextDelegate;

    public TedViewHolders(View itemView,TedTalkDelegates tedWatchNextDelegate)
    {
        super(itemView);
        mTedWatchNextDelegate=tedWatchNextDelegate;
        itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                mTedWatchNextDelegate.onTapNews();
            }
        });
    }
}
