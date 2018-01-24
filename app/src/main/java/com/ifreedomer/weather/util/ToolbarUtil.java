package com.ifreedomer.weather.util;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ifreedomer.weather.R;


/**
 * @author:eavawu
 * @since: 29/10/2017.
 * TODO:
 */

public class ToolbarUtil {

    public static void setTitleBar(final AppCompatActivity context, Toolbar toolbar) {
        context.setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(context.getResources().getColor(R.color.whiteColor));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.finish();
            }
        });
    }
}
