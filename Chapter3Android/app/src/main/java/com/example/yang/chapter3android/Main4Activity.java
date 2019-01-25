package com.example.yang.chapter3android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        textView = findViewById(R.id.text);
        button1 = findViewById(R.id.bu1);
        button2 = findViewById(R.id.bu2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bu1:
                textView.setText("海日生残夜，");
                break;
            case R.id.bu2:
                textView.setText("江春入旧年。");
                break;
            default:
                break;
        }
    }
}
