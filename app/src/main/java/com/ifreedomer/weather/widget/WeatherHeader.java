package com.ifreedomer.weather.widget;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ifreedomer.weather.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author eavawu
 * @since 24/01/2018.
 */

public class WeatherHeader extends ConstraintLayout {
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
    private Context mCtx;

    public WeatherHeader(Context context) {
        super(context);
        initView(context);
    }

    public WeatherHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        this.mCtx = context;
        View view =  View.inflate(context, R.layout.weather_header, this);
        ButterKnife.bind(this, view);
    }
}
