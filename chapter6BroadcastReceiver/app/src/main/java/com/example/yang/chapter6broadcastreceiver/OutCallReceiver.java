package com.example.yang.chapter6broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/**
 * Created by yang on 2018/6/28.
 */

public class OutCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String outcallnumber = getResultData();
        SharedPreferences sp = context.getSharedPreferences("config", Context.MODE_PRIVATE);
        String number = sp.getString("number", "");
        if(outcallnumber.equals(number)){
            setResultData(null);
        }
    }
}
