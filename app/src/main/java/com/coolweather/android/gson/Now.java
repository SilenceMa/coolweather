package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 马鹏飞 on 2017/5/8.
 */

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
