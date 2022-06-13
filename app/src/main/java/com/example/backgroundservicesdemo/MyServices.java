package com.example.backgroundservicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyServices extends Service {
    
    private static final String TAG = "MyServices";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        CountDownTimer timer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long m) {

                Log.d(TAG, "onTick: "+m/1000);


            }

            @Override
            public void onFinish() {

                Log.d(TAG, "onFinish: ");
            }
        }.start();

        return START_STICKY;
    }
}
