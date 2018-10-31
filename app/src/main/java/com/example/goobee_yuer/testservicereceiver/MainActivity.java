package com.example.goobee_yuer.testservicereceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //启动后台服务
        Intent service=new Intent(this, MyTimeService.class);
        startService(service);
        finish();
    }
}
