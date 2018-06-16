package com.padcmyanmar.tedapp.data.vos;

import java.util.List;

public class PlaylistVO
{
    private int playlistId;
    private String title;
    private String imageUrl;
    private int totalTalks;
    private String description;
    private List<TalkInPlaylistVO> talkInPlaylist;
}
