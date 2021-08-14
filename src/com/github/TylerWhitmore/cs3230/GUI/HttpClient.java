package com.github.TylerWhitmore.cs3230.GUI;

import com.github.TylerWhitmore.cs3230.GUI.Models.Item;
import com.github.TylerWhitmore.cs3230.GUI.Models.Result;
import kong.unirest.HttpRequest;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.util.Arrays;

public class HttpClient {
    String baseUrl = "https://youtube.googleapis.com";
    static String apiKey = "AIzaSyASnLP93xb2mlh-7-F6lg-7HNlso7mrB_c";

    public Result getResult(String q){
        return Unirest.get(baseUrl + "/youtube/v3/search")
                .queryString("q",q)
                .queryString("key",apiKey)
                .queryString("kind","youtube#video")
                .asObject(Result.class).getBody();
    }

    public Result getResult(){
        return Unirest.get(baseUrl + "/youtube/v3/search")
                .queryString("q","RossBoomsocks")
                .queryString("key",apiKey)
                .queryString("kind","youtube#video")
                .asObject(Result.class).getBody();
    }

    public static void main(String[] args) {

        Result response = Unirest.get("https://youtube.googleapis.com/youtube/v3/search")
                .queryString("part","snippet")
                .queryString("order","viewCount")
                .queryString("q","RossBoomsocks")
                .queryString("key",apiKey)
                //.queryString("part","snippet")
                .asObject(Result.class).getBody();
        //System.out.println(response.getEtag());
        for (Item x : response.getItem()){
            System.out.println(x.getEtag());
        }
        //System.out.println(Arrays.toString(response.getItem()));
    }

}
