package com.github.TylerWhitmore.cs3230.GUI.Models;

public class Result {
    Item[] item;
    String etag;

    public Item[] getItem() {
        return item;
    }
    public String getEtag(){
        return "Result Etag";
        //return etag;
    }
}
