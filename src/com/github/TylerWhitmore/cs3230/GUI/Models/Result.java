package com.github.TylerWhitmore.cs3230.GUI.Models;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class Result {
    private ArrayList<Video> items;

    public ArrayList<Video> getItems() {
        return items;
    }


}
/* 5 results returned from query
//paste everything here
//http://jsoneditoronline.org/
//for a breakdown of the parts

{
    "kind": "youtube#searchListResponse",
    "etag": "eOQTbrRNHYm6XLPU5gUqny6hnFY",
    "nextPageToken": "CAUQAA",
    "regionCode": "US",
    "pageInfo": {
        "totalResults": 8983,
        "resultsPerPage": 5
    },
    "items": [
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
        },
        {
            "kind": "youtube#searchResult",
            "etag": "7PD50OPDAxej06Nf8-QHIutvxv4",
            "id": {
                "kind": "youtube#video",
                "videoId": "dw9Nf3waBSk"
            },
            "snippet": {
                "publishedAt": "2019-10-28T22:00:06Z",
                "channelId": "UCfSVMX8vs7xA_hqFcuFqgwQ",
                "title": "Veigar but it&#39;s URF and he can basically Ulti you at full health and still one shot you",
                "description": "Is it even legal to play Veigar in urf when he one shots THAT hard? Follow my stream: http://www.twitch.tv/Rossboomsocks My Second Channel: ...",
                "thumbnails": {
                    "default": {
                        "url": "https://i.ytimg.com/vi/dw9Nf3waBSk/default.jpg",
                        "width": 120,
                        "height": 90
                    },
                    "medium": {
                        "url": "https://i.ytimg.com/vi/dw9Nf3waBSk/mqdefault.jpg",
                        "width": 320,
                        "height": 180
                    },
                    "high": {
                        "url": "https://i.ytimg.com/vi/dw9Nf3waBSk/hqdefault.jpg",
                        "width": 480,
                        "height": 360
                    }
                },
                "channelTitle": "RossBoomsocks",
                "liveBroadcastContent": "none",
                "publishTime": "2019-10-28T22:00:06Z"
            }
        },
        {
            "kind": "youtube#searchResult",
            "etag": "pEPl_MTnYhrGceLrquRxpHKCGAI",
            "id": {
                "kind": "youtube#video",
                "videoId": "prU6kwnGDgI"
            },
            "snippet": {
                "publishedAt": "2019-08-05T21:00:05Z",
                "channelId": "UCfSVMX8vs7xA_hqFcuFqgwQ",
                "title": "Zac but I take up 90% of the lane because I am a B I G  B O I with too much HP",
                "description": "A new B I G  B O I  has entered the fray, Zac just has way too much HP Follow my stream: http://www.twitch.tv/Rossboomsocks My Second Channel: ...",
                "thumbnails": {
                    "default": {
                        "url": "https://i.ytimg.com/vi/prU6kwnGDgI/default.jpg",
                        "width": 120,
                        "height": 90
                    },
                    "medium": {
                        "url": "https://i.ytimg.com/vi/prU6kwnGDgI/mqdefault.jpg",
                        "width": 320,
                        "height": 180
                    },
                    "high": {
                        "url": "https://i.ytimg.com/vi/prU6kwnGDgI/hqdefault.jpg",
                        "width": 480,
                        "height": 360
                    }
                },
                "channelTitle": "RossBoomsocks",
                "liveBroadcastContent": "none",
                "publishTime": "2019-08-05T21:00:05Z"
            }
        },
        {
            "kind": "youtube#searchResult",
            "etag": "TUK8mHnOp1B5Si8NDWLeAXeNydA",
            "id": {
                "kind": "youtube#video",
                "videoId": "CDgCLi-YM6M"
            },
            "snippet": {
                "publishedAt": "2019-04-02T19:58:48Z",
                "channelId": "UCfSVMX8vs7xA_hqFcuFqgwQ",
                "title": "A 7 hour iron ranked game...",
                "description": "This was meant to be posted on april fools, it took over 24 hours to upload... Join the sockdrawer and subscribe for more: http://bit.ly/RossBoomsocks Follow my ...",
                "thumbnails": {
                    "default": {
                        "url": "https://i.ytimg.com/vi/CDgCLi-YM6M/default.jpg",
                        "width": 120,
                        "height": 90
                    },
                    "medium": {
                        "url": "https://i.ytimg.com/vi/CDgCLi-YM6M/mqdefault.jpg",
                        "width": 320,
                        "height": 180
                    },
                    "high": {
                        "url": "https://i.ytimg.com/vi/CDgCLi-YM6M/hqdefault.jpg",
                        "width": 480,
                        "height": 360
                    }
                },
                "channelTitle": "RossBoomsocks",
                "liveBroadcastContent": "none",
                "publishTime": "2019-04-02T19:58:48Z"
            }
        },
        {
            "kind": "youtube#searchResult",
            "etag": "DRGSUfdpwwP4nXcwuoneHPXs2sQ",
            "id": {
                "kind": "youtube#video",
                "videoId": "ajeDr_Cr0uw"
            },
            "snippet": {
                "publishedAt": "2020-01-19T22:00:01Z",
                "channelId": "UCfSVMX8vs7xA_hqFcuFqgwQ",
                "title": "Sett but I build 6 warmogs because his W scales with max health and does 1k true damage every 8 secs",
                "description": "As broken as Sett already is, building him full health makes his W do far too much damage Our merch: http://www.shopsaikou.com Follow my stream: ...",
                "thumbnails": {
                    "default": {
                        "url": "https://i.ytimg.com/vi/ajeDr_Cr0uw/default.jpg",
                        "width": 120,
                        "height": 90
                    },
                    "medium": {
                        "url": "https://i.ytimg.com/vi/ajeDr_Cr0uw/mqdefault.jpg",
                        "width": 320,
                        "height": 180
                    },
                    "high": {
                        "url": "https://i.ytimg.com/vi/ajeDr_Cr0uw/hqdefault.jpg",
                        "width": 480,
                        "height": 360
                    }
                },
                "channelTitle": "RossBoomsocks",
                "liveBroadcastContent": "none",
                "publishTime": "2020-01-19T22:00:01Z"
            }
        }
    ]
}
 */
