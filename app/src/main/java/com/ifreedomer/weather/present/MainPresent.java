package com.ifreedomer.weather.present;

import com.ifreedomer.weather.R;
import com.ifreedomer.weather.activity.MainActivity;
import com.ifreedomer.weather.bean.IPLocationResult;
import com.ifreedomer.weather.bean.XiaomiWeatherResult;
import com.ifreedomer.weather.network.retrofit.HttpManager;
import com.ifreedomer.weather.util.LogUtil;
import com.ifreedomer.weather.util.SPUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author eavawu
 * @since 21/01/2018.
 */

public class MainPresent {
    private MainActivity mainActivity;
    private static final String TAG = MainPresent.class.getSimpleName();
    private static final String CITY_KEY = "city";

    public MainPresent(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    public void reqCity() {
        HttpManager.getInstance().reqCity(new Callback<IPLocationResult>() {
            @Override
            public void onResponse(Call<IPLocationResult> call, Response<IPLocationResult> response) {
                IPLocationResult body = response.body();
                String address = body == null ? (String) SPUtil.get(mainActivity, CITY_KEY, mainActivity.getString(R.string.beijing)) : body.getAddress();
                String cityNum = getCityNum(address);
                reqWeather(cityNum);
                LogUtil.d(TAG, "onResponse:" + body.toString());
            }

            @Override
            public void onFailure(Call<IPLocationResult> call, Throwable t) {
                LogUtil.d(TAG, "onFailure:" + t.toString());
            }
        });
    }


    public String getCityNum(String cityName) {
        return "weathercn:101010100";
    }

    public void reqWeather(String cityNum) {
        HttpManager.getInstance().reqWeather(cityNum, new Callback<XiaomiWeatherResult>() {
            @Override
            public void onResponse(Call<XiaomiWeatherResult> call, Response<XiaomiWeatherResult> response) {
                XiaomiWeatherResult body = response.body();
            }

            @Override
            public void onFailure(Call<XiaomiWeatherResult> call, Throwable t) {

            }
        });

    }
}
