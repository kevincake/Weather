package com.ifreedomer.location;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import java.util.List;

/**
 * Map location manager;
 *
 * @author eavawu
 * @since 20/01/2018.
 */

public class LocationClient {
    public static final int ERROR_LOCATIONMANAGER_NULL = 0;
    public static final String LOCALTIONMANAGER_NULL_DESC = "get systemService locationManager is null.retry init";

    public static final int ERROR_NO_PROVIDER = 1;
    public static final String NO_PROVIDER_DESC = "there is no get location provider";


    public static final int ERROR_NO_PERMISSION = 2;
    public static final String NO_PERMISSION_DESC = "access location permission denied.check dynamic permission 6.0+";

    private boolean isDebug = true;
    private static final String TAG = LocationClient.class.getSimpleName();

    private LocationManager mLocationManager;

    private LocationClient() {
    }

    private static LocationClient mInstance = new LocationClient();

    public static LocationClient getInstance() {
        return mInstance;
    }


    @SuppressLint("MissingPermission")
    public void startLocationOnce(String provider, final DefaultLocationListener defaultLocationListener) {
        mLocationManager.requestLocationUpdates(provider, 0, 0, new DefaultLocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                if (defaultLocationListener != null) {
                    defaultLocationListener.onLocationChanged(location);
                }
            }
        });
    }


    public Location getLastKnowLocation(String provider) {
        @SuppressLint("MissingPermission") Location lastKnownLocation = mLocationManager.getLastKnownLocation(provider);
        return lastKnownLocation;
    }

    public void init(Context context, InitListener initListener) {

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (initListener != null) {
                initListener.onFailed(ERROR_NO_PERMISSION, NO_PERMISSION_DESC);
            }
            return;
        }
        mLocationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        if (mLocationManager == null) {
            if (isDebug) {
                Log.e(TAG, "LocationManager is null");
            }
            if (initListener != null) {
                initListener.onFailed(ERROR_LOCATIONMANAGER_NULL, LOCALTIONMANAGER_NULL_DESC);
            }
            return;
        }
        List<String> providers = mLocationManager.getProviders(true);
        if (providers.contains(LocationManager.GPS_PROVIDER)) {
            //GPS
            String locationProvider = LocationManager.GPS_PROVIDER;
            if (initListener != null) {
                initListener.onSuccess(locationProvider);
                return;
            }
        } else if (providers.contains(LocationManager.NETWORK_PROVIDER)) {
            //netWork
            String locationProvider = LocationManager.NETWORK_PROVIDER;
            if (initListener != null) {
                initListener.onSuccess(locationProvider);
                return;
            }
        } else {
            if (initListener != null) {
                initListener.onFailed(ERROR_NO_PROVIDER, NO_PROVIDER_DESC);
                return;
            }
        }
    }


    public interface InitListener {
        void onSuccess(String provider);

        void onFailed(int errorCode, String errorMsg);
    }
}
