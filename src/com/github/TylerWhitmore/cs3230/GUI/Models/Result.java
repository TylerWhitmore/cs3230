package com.github.TylerWhitmore.cs3230.GUI.Models;

import com.google.gson.JsonObject;

public class Result {
    JsonObject item;
    String etag;

    public JsonObject getItem() {
        return item;
    }
    public String getEtag(){
        //return "Result Etag";
        return etag;
    }
}
