package com.ifreedomer.weather.adapter;

import android.content.Context;

import com.ifreedomer.weather.bean.HourWeatherInfo;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * @author eavawu
 * @since 23/01/2018.
 */

public class HourAdapter extends CommonAdapter<HourWeatherInfo> {
    public HourAdapter(Context context, int layoutId, List<HourWeatherInfo> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, HourWeatherInfo hourWeatherInfo, int position) {

    }
}
