package com.ifreedomer.weather.adapter;

import android.content.Context;

import com.ifreedomer.weather.bean.WeeklyInfo;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * @author eavawu
 * @since 24/01/2018.
 */

public class WeeklyAdapter extends CommonAdapter<WeeklyInfo> {
    public WeeklyAdapter(Context context, int layoutId, List<WeeklyInfo> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, WeeklyInfo weeklyInfo, int position) {

    }
}
