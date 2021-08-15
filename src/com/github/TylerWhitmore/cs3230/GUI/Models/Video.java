package com.github.TylerWhitmore.cs3230.GUI.Models;

import com.google.gson.JsonObject;

public class Video {
    private String videoId;
    private String videoTitle;
    private String videoDesc;
    private String videoChannel;

    public static Video deserialize(JsonObject item){
        return new Video(
                item.get("id").getAsJsonObject().get("videoId").getAsString(),
                item.get("snippet").getAsJsonObject().get("title").getAsString(),
                item.get("snippet").getAsJsonObject().get("description").getAsString(),
                item.get("snippet").getAsJsonObject().get("channelTitle").getAsString()
        );
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoDesc() {
        return videoDesc;
    }

    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }

    public String getVideoChannel() {
        return videoChannel;
    }

    public void setVideoChannel(String videoChannel) {
        this.videoChannel = videoChannel;
    }

    public Video(String videoId, String videoTitle, String videoDesc, String videoChannel) {
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.videoDesc = videoDesc;
        this.videoChannel = videoChannel;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId='" + videoId + '\'' +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoDesc='" + videoDesc + '\'' +
                ", videoChannel='" + videoChannel + '\'' +
                '}';
    }
/*
    {
            "kind": "youtube#searchResult",
            "etag": "FZrCk41kq0rx1RAvDzWdOXqwMFg",
            "id": {
                "kind": "youtube#video",
                "videoId": "nq6AcK86otc"
            },
            "snippet": {
                "publishedAt": "2019-09-05T21:30:00Z",
                "channelId": "UCfSVMX8vs7xA_hqFcuFqgwQ",
                "title": "League of Legends but we have 5 hooks so the enemy just cannot move at all lool",
                "description": "Follow my stream: http://www.twitch.tv/Rossboomsocks My Second Channel: https://www.youtube.com/channel/UCE-oBr9wkhpPK2P3sAnbkVQ/ TWITTER: ...",
                "thumbnails": {
                    "default": {
                        "url": "https://i.ytimg.com/vi/nq6AcK86otc/default.jpg",
                        "width": 120,
                        "height": 90
                    },
                    "medium": {
                        "url": "https://i.ytimg.com/vi/nq6AcK86otc/mqdefault.jpg",
                        "width": 320,
                        "height": 180
                    },
                    "high": {
                        "url": "https://i.ytimg.com/vi/nq6AcK86otc/hqdefault.jpg",
                        "width": 480,
                        "height": 360
                    }
                },
                "channelTitle": "RossBoomsocks",
                "liveBroadcastContent": "none",
                "publishTime": "2019-09-05T21:30:00Z"
            }
        }
     */
}
