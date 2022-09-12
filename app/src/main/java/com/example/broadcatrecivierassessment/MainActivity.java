package com.example.broadcatrecivierassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private MicrophoneBroadcastReceive MicrophoneBroadcastReceive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MicrophoneBroadcastReceive = new MicrophoneBroadcastReceive();
        Log.i("data1","mic is ok");
        IntentFilter receiverFilter = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        registerReceiver(MicrophoneBroadcastReceive, receiverFilter);
    }
}