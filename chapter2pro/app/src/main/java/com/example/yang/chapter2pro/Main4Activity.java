package com.example.yang.chapter2pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        MyDialog myDialog = new MyDialog(this, "我是自定义的Dialog");
        myDialog.show();
    }
}
