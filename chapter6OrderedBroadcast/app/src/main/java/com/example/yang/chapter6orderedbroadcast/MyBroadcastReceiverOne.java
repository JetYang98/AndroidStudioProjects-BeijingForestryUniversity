package com.example.yang.chapter6orderedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by yang on 2018/6/28.
 */

public class MyBroadcastReceiverOne extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MyBroadcastRecieverOne", "自定义的广播接收者One，接收到了广播事件");
    }
}
