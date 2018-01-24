package com.ifreedomer.weather.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ifreedomer.weather.R;
import com.ifreedomer.weather.adapter.WeeklyAdapter;
import com.ifreedomer.weather.bean.WeeklyInfo;
import com.ifreedomer.weather.widget.WeatherHeader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author eavawu
 * @since 24/01/2018.
 */

public class WeeklyFragment extends Fragment {
    @BindView(R.id.topTemperatureLayout)
    WeatherHeader topTemperatureLayout;
    @BindView(R.id.weekly_rv)
    RecyclerView weeklyRv;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weekly, container, false);
        unbinder = ButterKnife.bind(this, view);
        initLogic();
        return view;
    }

    private void initLogic() {
        List<WeeklyInfo> weeklyInfoList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            weeklyInfoList.add(new WeeklyInfo());
        }
        weeklyRv.setAdapter(new WeeklyAdapter(getActivity(), R.layout.item_weekly_info, weeklyInfoList));
        weeklyRv.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
