package com.example.goobee_yuer.testservicereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Goobee_yuer on 2018/10/31.
 */

public class DataChangeReceiver extends BroadcastReceiver {
    private String TAG = "TestReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: 时间变化");
    }
}
