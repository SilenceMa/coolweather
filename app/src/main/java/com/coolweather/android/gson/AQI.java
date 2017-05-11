package com.coolweather.android.gson;

/**
 * Created by 马鹏飞 on 2017/5/8.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
