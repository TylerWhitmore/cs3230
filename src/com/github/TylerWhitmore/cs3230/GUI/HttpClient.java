package com.github.TylerWhitmore.cs3230.GUI;

import com.github.TylerWhitmore.cs3230.GUI.Models.Video;
import com.google.gson.JsonObject;
import kong.unirest.Unirest;

public class HttpClient {
    static String baseUrl = "https://youtube.googleapis.com";
    static String apiKey = "AIzaSyASnLP93xb2mlh-7-F6lg-7HNlso7mrB_c";

    public static JsonObject getResult(String q){
        return Unirest.get(baseUrl + "/youtube/v3/search")
                .queryString("part","snippet")
                .queryString("order","viewCount")
                .queryString("q",q)
                .queryString("key",apiKey)
                .queryString("kind","youtube#video")
                .asObject(JsonObject.class).getBody();
    }

    public static JsonObject getResult(){
        return Unirest.get(baseUrl + "/youtube/v3/search")
                .queryString("part","snippet") //needs to be snippet
                .queryString("order","viewCount") //needs to be viewCount
                .queryString("q","RossBoomsocks") //whatever the person searches for
                .queryString("key",apiKey) //api key
                .queryString("kind","youtube#video") //only pull up videos
                .asObject(JsonObject.class).getBody();
    }

    public static void main(String[] args) {
        JsonObject response = getResult("Let's Game It Out");
        JsonObject item = response.getAsJsonArray("items").get(0).getAsJsonObject();
        Video test = Video.deserialize(item);

        try {
            System.out.println(test.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
