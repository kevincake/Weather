package com.ifreedomer.location;

import android.location.LocationListener;
import android.os.Bundle;

/**
 * @author eavawu
 * @since 20/01/2018.
 */

public abstract class DefaultLocationListener implements LocationListener {

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
