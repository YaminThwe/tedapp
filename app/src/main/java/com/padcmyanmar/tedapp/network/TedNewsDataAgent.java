package com.padcmyanmar.tedapp.network;

import com.padcmyanmar.tedapp.data.vos.TedNewsVO;

import java.util.List;

public interface TedNewsDataAgent
{
    void loadTedNews();

    List<TedNewsVO> loadTedList(int page, String accessToken);

}
