package com.ifreedomer.weather.network.retrofit;

import com.ifreedomer.weather.bean.IPLocationResult;
import com.ifreedomer.weather.bean.XiaomiWeatherResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author eavawu
 * @since 21/01/2018.
 */

public class HttpManager {
    private static HttpManager mHttpManager = new HttpManager();
    private Retrofit bdRetrofit = new Retrofit.Builder()
            .baseUrl("https://api.map.baidu.com/").addConverterFactory(GsonConverterFactory.create()).build();

    private Retrofit xiaomiRetrofit = new Retrofit.Builder().baseUrl("https://weatherapi.market.xiaomi.com/")
            .addConverterFactory(GsonConverterFactory.create()).build();

    private HttpManager() {
    }

    public static HttpManager getInstance() {
        return mHttpManager;
    }

    public void reqCity(Callback<IPLocationResult> callback) {
        BDIPLocationApi bdWeatherApi = bdRetrofit.create(BDIPLocationApi.class);
        Call<IPLocationResult> ipLocationCall = bdWeatherApi.getCity("LNbgxgo5gsZWVKxdxtg1wcvQnYavKj1p");
        ipLocationCall.enqueue(callback);
    }

    public void reqWeather(String cityNum, Callback<XiaomiWeatherResult> callback) {
        XiaomiApi xiaomiApi = xiaomiRetrofit.create(XiaomiApi.class);
        Call<XiaomiWeatherResult> weatherCall = xiaomiApi.getWeather(0, 0, cityNum, "zUFJoAR2ZVrDy1vF3D07", false, "zh_cn", 7, "weather20151024");
        weatherCall.enqueue(callback);
    }
}
