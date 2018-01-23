package com.ifreedomer.weather.bean;

/**
 * @author eavawu
 * @since 07/01/2018.
 */

public class TabInfo {
    private int iconRes;
    private String title;

    public TabInfo(int iconRes, String title) {
        this.iconRes = iconRes;
        this.title = title;
    }

    public int getIconRes() {
        return iconRes;
    }

    public void setIconRes(int iconRes) {
        this.iconRes = iconRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
