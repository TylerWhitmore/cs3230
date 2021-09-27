package com.github.TylerWhitmore.cs3230.GUI;

import com.google.gson.JsonObject;
import kong.unirest.Unirest;

public class HttpClient {
    static String baseUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY";
    static String apiKey = "7X1E97HH2N420BZI";

    public static JsonObject getResult(String q){
        return Unirest.get(baseUrl)
                .queryString("symbol",q)
                .queryString("interval","5min")
                .queryString("apikey",apiKey)
                .asObject(JsonObject.class).getBody();
    }

    public static JsonObject getResult(){
        return Unirest.get(baseUrl)
                .queryString("symbol","GOOGL")
                .queryString("interval","5min")
                .queryString("apikey",apiKey)
                .asObject(JsonObject.class).getBody();
    }

    public static void main(String[] args) {

    }

}
