package com.ifreedomer.weather.network.retrofit;

import com.ifreedomer.weather.bean.XiaomiWeatherResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author eavawu
 * @since 21/01/2018.
 */

public interface XiaomiApi {

    @GET("wtr-v3/weather/all")
    Call<XiaomiWeatherResult> getWeather(@Query("latitude")long  latitude, @Query("longitude")long longitude
            , @Query("locationKey")String locationKey, @Query("sign")String sign
            , @Query("isGlobal")boolean isGlobal, @Query("locale")String locale
            , @Query("days")int days, @Query("appKey")String appKey) ;
}
