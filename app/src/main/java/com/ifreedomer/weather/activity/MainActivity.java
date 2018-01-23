package com.ifreedomer.weather.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ifreedomer.weather.R;
import com.ifreedomer.weather.adapter.ViewPagerFragmentAdapter;
import com.ifreedomer.weather.bean.TabInfo;
import com.ifreedomer.weather.fragment.TodayFragment;
import com.ifreedomer.weather.present.MainPresent;
import com.ifreedomer.weather.widget.IconTableView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.toolbar)
    @Nullable
    Toolbar mToolbar;
    @BindView(R.id.tab)
    @Nullable
    TabLayout mTab;
    @BindView(R.id.viewpager)
    @Nullable
    ViewPager mViewpager;
    @BindView(R.id.pb)
    @Nullable
    ProgressBar mPb;
    @BindView(R.id.tv_progress)
    @Nullable
    TextView mTvProgress;
    @Nullable
    @BindView(R.id.lin_loading)
    LinearLayout mLinLoading;

    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<TabInfo> mTabList = new ArrayList<>();
    private MainPresent mMainPresent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_viewpager);
        ButterKnife.bind(this);
        mMainPresent = new MainPresent(this);
        initToolBar();
        initLogic();
        getWeather();
    }

    private void getWeather() {
        mMainPresent.reqCity();
    }

    @Override
    public void initToolBar() {
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setVisibility(View.GONE);
    }

    @Override
    public void initLogic() {
        mTabList.add(new TabInfo(R.drawable.tab_today_selector, getString(R.string.today)));
        mTabList.add(new TabInfo(R.drawable.tab_weekly_selector, getString(R.string.weekly)));
        mTabList.add(new TabInfo(R.drawable.tab_today_selector, getString(R.string.favorite)));

        mFragmentList.add(new TodayFragment());
        mFragmentList.add(new TodayFragment());
        mFragmentList.add(new TodayFragment());

        // init view pager
        ViewPagerFragmentAdapter pagerAdapter = new ViewPagerFragmentAdapter(getSupportFragmentManager(), mFragmentList);
        mViewpager.setAdapter(pagerAdapter);
        mViewpager.setOffscreenPageLimit(2);
        mTab.setupWithViewPager(mViewpager);
        for (int i = 0; i < mTab.getTabCount(); i++) {
            IconTableView iconTableView = new IconTableView(this);
            TabInfo tabInfo = mTabList.get(i);
            iconTableView.setIcon(tabInfo.getIconRes());
            iconTableView.setTitle(tabInfo.getTitle());
            TabLayout.Tab tabContainer = mTab.getTabAt(i);
            if (tabContainer == null) {
                continue;
            }
            tabContainer.setCustomView(iconTableView);
        }
    }
}
