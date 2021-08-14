package com.github.TylerWhitmore.cs3230.GUI;

import com.github.TylerWhitmore.cs3230.GUI.Models.Item;
import com.github.TylerWhitmore.cs3230.GUI.Models.Result;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import kong.unirest.HttpRequest;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.util.Arrays;

public class HttpClient {
    static String baseUrl = "https://youtube.googleapis.com";
    static String apiKey = "AIzaSyASnLP93xb2mlh-7-F6lg-7HNlso7mrB_c";

    public static Result getResult(String q){
        return Unirest.get(baseUrl + "/youtube/v3/search")
                .queryString("part","snippet")
                .queryString("order","viewCount")
                .queryString("q",q)
                .queryString("key",apiKey)
                .queryString("kind","youtube#video")
                .asObject(Result.class).getBody();
    }

    public static Result getResult(){
        return Unirest.get(baseUrl + "/youtube/v3/search")
                .queryString("part","snippet")
                .queryString("order","viewCount")
                .queryString("q","RossBoomsocks")
                .queryString("key",apiKey)
                .queryString("kind","youtube#video")
                .asObject(Result.class).getBody();
    }

    public static void main(String[] args) {

        Result response = getResult("Let's Game It Out");
        Result response2 = getResult();
        System.out.println(response.getEtag());
        JsonObject x = response.getItem();
        String test;
        for (String i : x){
            test = x.get("etag").getAsString();
            System.out.println(test);
        }


        //System.out.println(Arrays.toString(response.getItem()));
        System.out.println(response2.getEtag());
//        for (Item x : response.getItem()){
//            System.out.println(x.getEtag());
//        }
        //System.out.println(Arrays.toString(response.getItem()));
    }

}
