package com.coolweather.android.gson;

/**
 * Created by steven on 2018/9/21.
 */

import com.google.gson.annotations.SerializedName;



public class Now {



    @SerializedName("tmp")
    public String temperature;



    @SerializedName("cond")
    public More more;



    public class More {



        @SerializedName("txt")
        public String info;



    }



}