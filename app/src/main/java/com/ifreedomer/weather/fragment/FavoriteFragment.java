package com.ifreedomer.weather.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ifreedomer.weather.R;

/**
 * @author eavawu
 * @since 24/01/2018.
 */

public class FavoriteFragment extends Fragment {

    private Toolbar mToolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        initLogic();
        return view;
    }

    public void initLogic() {
        mToolbar = getActivity().findViewById(R.id.toolbar);
        if (mToolbar != null) {
            mToolbar.inflateMenu(R.menu.favorite_menu);
            mToolbar.setTitleTextColor(getResources().getColor(R.color.whiteColor));
            mToolbar.setTitle(R.string.favorite);
        }
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser) {
            if (mToolbar != null) {
                mToolbar.setVisibility(View.VISIBLE);
            }
        } else {
            if (mToolbar != null) {
                mToolbar.setVisibility(View.GONE);
            }
        }
        super.setUserVisibleHint(isVisibleToUser);
    }

}
