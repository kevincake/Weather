package com.ifreedomer.weather.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifreedomer.weather.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author:eavawu
 * @date: 5/22/16.
 * @todo:
 */
public class IconTableView extends RelativeLayout {
    @BindView(R.id.iconIv)
    ImageView iconIv;
    @BindView(R.id.titleTv)
    TextView titleTv;

    public IconTableView(Context context) {
        super(context);
        initView(context);
    }

    public IconTableView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);

    }

    public void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.tab_icon, this);
        ButterKnife.bind(this);
    }

    public void setIcon(int resId) {
        iconIv.setImageResource(resId);
    }

    public void setTitle(String title) {
        titleTv.setText(title);
    }
}
