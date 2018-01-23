package com.ifreedomer.weather.network.retrofit;

import com.ifreedomer.weather.bean.IPLocationResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author eavawu
 * @since 21/01/2018.
 */

public interface BDIPLocationApi {
    @GET("/location/ip")
    Call<IPLocationResult> getCity(@Query("ak") String ak);

}
