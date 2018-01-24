package com.ifreedomer.weather.adapter;

import android.content.Context;

import com.ifreedomer.weather.bean.WeatherDetailItem;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * @author eavawu
 * @since 24/01/2018.
 */

public class WeatherDetailAdapter extends CommonAdapter<WeatherDetailItem> {
    public WeatherDetailAdapter(Context context, int layoutId, List<WeatherDetailItem> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, WeatherDetailItem weatherDetailItem, int position) {

    }
}
