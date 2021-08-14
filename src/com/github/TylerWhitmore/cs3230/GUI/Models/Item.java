package com.github.TylerWhitmore.cs3230.GUI.Models;

import java.util.Date;

public class Item {
    String etag;
    Id id;
    Snippet snippet;

    public String getEtag(){
        return "ItemEtag";
        //return etag;
    }
    public Id getId() {
        return id;
    }
    public Snippet getSnippet(){
        return snippet;
    }


    /*
    "items": [
    {
      "kind": "youtube#searchResult",
      "etag": "dXzeDtUYjUoLSBno9cu62FkUQ_o",
      "id": {
        "kind": "youtube#video",
        "videoId": "yUPkRkrl9ng"
      },
      "snippet": {
        "publishedAt": "2021-04-16T19:00:23Z",
        "channelId": "UCfSVMX8vs7xA_hqFcuFqgwQ",
        "title": "i offered you all $100 for your MOST EMBARRASSING fails",
        "description": "It happens to the best of us, so might as well make 100 bucks for it Submit on Reddit: http://www.reddit.com/r/Rossboomsocks Our merch: ...",
        "thumbnails": {
          "default": {
            "url": "https://i.ytimg.com/vi/yUPkRkrl9ng/default.jpg",
            "width": 120,
            "height": 90
          },
          "medium": {
            "url": "https://i.ytimg.com/vi/yUPkRkrl9ng/mqdefault.jpg",
            "width": 320,
            "height": 180
          },
          "high": {
            "url": "https://i.ytimg.com/vi/yUPkRkrl9ng/hqdefault.jpg",
            "width": 480,
            "height": 360
          }
        },
        "channelTitle": "RossBoomsocks",
        "liveBroadcastContent": "none",
        "publishTime": "2021-04-16T19:00:23Z"
      }
    }
     */

}
