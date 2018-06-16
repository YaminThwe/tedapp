package com.padcmyanmar.tedapp.data.models;

import com.padcmyanmar.tedapp.network.HttpUrlConnectionTedDataAgent;
import com.padcmyanmar.tedapp.network.TedNewsDataAgent;

public class TedNewsModels
{
    private static TedNewsModels objInstance;
    private TedNewsDataAgent tedDataAgent;
    private TedNewsModels()
    {
        tedDataAgent= HttpUrlConnectionTedDataAgent.getObjInstance();

    }
    public static TedNewsModels getObjInstance()
    {
        if(objInstance==null)
        {
            objInstance=new TedNewsModels();
        }
        return objInstance;
    }
    public  void loadTedNewsList()
    {
        tedDataAgent.loadTedList(1,"b002c7e1a528b7cb460933fc2875e916");
    }
}
