package com.example.yang.temptransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Button button1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        editText1 = findViewById(R.id.edit1);
        radioButton1 = findViewById(R.id.radio1);
        radioButton2 = findViewById(R.id.radio2);
        button1 = findViewById(R.id.bu1);
        textView1 = findViewById(R.id.xianshi);
    }
    public void onClick(View view){
        float temp = Float.parseFloat(editText1.getText().toString());
        float result = 0;
        String str;
        if(radioButton1.isChecked()){
            result = (float)(5.0/9.0*(temp - 32));
            str = "对应的摄氏温度为：" + String.format("%.1f", result);
        }else{
            result = (float)(9.0/5.0*(temp + 32));
            str = "对应的华氏温度为：" + String.format("%.1f", result);
        }
        textView1.setText(str);
    }
}
