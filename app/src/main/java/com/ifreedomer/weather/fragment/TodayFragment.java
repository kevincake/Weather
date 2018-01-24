package com.ifreedomer.weather.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ifreedomer.weather.R;
import com.ifreedomer.weather.adapter.HourAdapter;
import com.ifreedomer.weather.adapter.WeatherDetailAdapter;
import com.ifreedomer.weather.bean.HourWeatherInfo;
import com.ifreedomer.weather.bean.WeatherDetailItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author eavawu
 * @since 19/01/2018.
 */

public class TodayFragment extends Fragment {
    @BindView(R.id.weatherIv)
    ImageView weatherIv;
    @BindView(R.id.addressTv)
    TextView addressTv;
    @BindView(R.id.dateTv)
    TextView dateTv;
    @BindView(R.id.temperatureTv)
    TextView temperatureTv;
    @BindView(R.id.unitTv)
    TextView unitTv;
    @BindView(R.id.topTemperatureTv)
    TextView topTemperatureTv;
    @BindView(R.id.lowTemeratureTv)
    TextView lowTemeratureTv;
    @BindView(R.id.topTemperatureLayout)
    ConstraintLayout topTemperatureLayout;
    @BindView(R.id.hourWeatherRv)
    RecyclerView hourWeatherRv;
    @BindView(R.id.weatherDetailRv)
    RecyclerView weatherDetailRv;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        unbinder = ButterKnife.bind(this, view);
        initLogic();
        return view;
    }

    private void initLogic() {
        List<HourWeatherInfo> hourWeatherInfos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hourWeatherInfos.add(new HourWeatherInfo());
        }
        HourAdapter hourAdapter = new HourAdapter(getActivity(), R.layout.item_hour_weather, hourWeatherInfos);
        hourWeatherRv.setAdapter(hourAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 5, LinearLayoutManager.VERTICAL, false);
        hourWeatherRv.setLayoutManager(gridLayoutManager);
        hourWeatherRv.getAdapter().notifyDataSetChanged();


        List<WeatherDetailItem> weatherDetailItems = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            weatherDetailItems.add(new WeatherDetailItem());
        }
        weatherDetailRv.setAdapter(new WeatherDetailAdapter(getActivity(), R.layout.item_weatherdetail_info, weatherDetailItems));
        weatherDetailRv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }


    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            hourWeatherRv.getAdapter().notifyDataSetChanged();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
