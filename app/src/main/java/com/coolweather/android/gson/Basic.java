package com.coolweather.android.gson;

/**
 * Created by steven on 2018/9/21.
 */
import com.google.gson.annotations.SerializedName;
public class Basic {


    @SerializedName("city")
    public String cityName;


    @SerializedName("id")
     public String weatherId;


    public Update update;


    public class Update {


        @SerializedName("loc")
        public String updateTime;


    }


}