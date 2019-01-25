package com.example.yang.chapter3android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        textView = findViewById(R.id.text);
        button1 = findViewById(R.id.bu1);
        MyClick myClick = new MyClick();
        button1.setOnClickListener(myClick);
    }
    private class MyClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            textView.setText("动作2");
        }
    }
}
