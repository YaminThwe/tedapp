package com.padcmyanmar.tedapp.data.vos;

import java.util.List;

public class TedNewsVO
{
    private int tedNewsId;
    private String title;
    private SpeakersVO speaker;
    private String imageUrl;
    private int durationInSecond;
    private String description;
    private List<TagVO> tag;

    public int getTedNewsId()
    {
        return tedNewsId;
    }

    public String getTitle()
    {
        return title;
    }

    public SpeakersVO getSpeaker()
    {
        return speaker;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public int getDurationInSecond()
    {
        return durationInSecond;
    }

    public String getDescription()
    {
        return description;
    }

    public List<TagVO> getTag()
    {
        return tag;
    }
}
