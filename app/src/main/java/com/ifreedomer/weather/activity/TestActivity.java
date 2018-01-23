package com.ifreedomer.weather.activity;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ifreedomer.location.LocationClient;
import com.ifreedomer.weather.R;
import com.ifreedomer.weather.manager.PermissionHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {
    // 所需的全部权限
    static final String[] PERMISSIONS = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
    };


    @BindView(R.id.btn_getLocation)
    Button btnGetLocation;
    @BindView(R.id.btn_init)
    Button btnInit;
    private String mProvider;
    private static final String TAG = TestActivity.class.getSimpleName();
    private PermissionHelper permissionHelper = new PermissionHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        btnGetLocation.setOnClickListener(this);
        btnInit.setOnClickListener(this);
        permissionHelper.requestPermission(this, permissionResultCallback, PERMISSIONS);

    }


    private PermissionHelper.PermissionResultCallback permissionResultCallback = new PermissionHelper.PermissionResultCallback() {
        @Override
        public void onPermissionResult(boolean allGranted) {

        }
    };

    private LocationClient.InitListener initListener = new LocationClient.InitListener() {
        @Override
        public void onSuccess(String provider) {
            mProvider = provider;
            Toast.makeText(TestActivity.this, mProvider, Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onFailed(int errorCode, String errorMsg) {
            Toast.makeText(TestActivity.this, "errorCode = " + errorCode + "  errorMsg = " + errorMsg, Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_getLocation:
                break;
            case R.id.btn_init:
                LocationClient.getInstance().init(this, initListener);
                break;
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        permissionHelper.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
