package com.github.TylerWhitmore.cs3230.GUI.Models;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

public class Ticker {

    public static String deserialize(JsonObject item) {
        try {
            //return item.toString();
            return parseStr(item.toString());
        } catch (Exception e) {
            return "Nope";
        }
    }

    public static String parseStr(String str){
        int symbolIndex = str.indexOf("Symbol");
        int startOfSymbol = symbolIndex+9;
        int endOfSymbol = str.indexOf(',',symbolIndex);
        int startOfOpen = str.indexOf("open",endOfSymbol);
        int endOfOpen = str.indexOf(',',startOfOpen);
        int startOfHigh = str.indexOf("high",endOfOpen);
        int endOfHigh = str.indexOf(',',startOfHigh);
        int startOfLow = str.indexOf("low",endOfHigh);
        int endOfLow = str.indexOf(',',startOfLow);
        int startOfClose = str.indexOf("close",endOfLow);
        int endOfClose = str.indexOf(',',startOfClose);
        int startOfVolume = str.indexOf("volume",endOfClose);
        int endOfVolume = str.indexOf('}',startOfVolume);

        String Symbol = str.substring(startOfSymbol,endOfSymbol-1);
        String Open = str.substring(startOfOpen+7,endOfOpen-1);
        String High = str.substring(startOfHigh+7,endOfHigh-1);
        String Low = str.substring(startOfLow+6,endOfLow-1);
        String Close = str.substring(startOfClose+8,endOfClose-1);
        String Volume = str.substring(startOfVolume+9,endOfVolume-1);

        String returnValue = (
                "Symbol: " + Symbol + "\n" +
                "Open: " + Open + '\n' +
                "High: " + High + '\n' +
                "Low: " + Low + '\n' +
                "Close: " + Close + '\n' +
                "Volume: " + Volume);
        return returnValue;
    }
}
