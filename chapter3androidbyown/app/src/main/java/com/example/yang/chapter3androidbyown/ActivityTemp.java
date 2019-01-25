package com.example.yang.chapter3androidbyown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class ActivityTemp extends AppCompatActivity {

    private EditText ateditText1;
    private RadioButton atradioButton1;
    private RadioButton atradioButton2;
    private Button atbutton1;
    private TextView attextView1;
    private Button atbutton11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        ateditText1 = findViewById(R.id.atedit1);
        atradioButton1 = findViewById(R.id.atradio1);
        atradioButton2 = findViewById(R.id.atradio2);
        atbutton1 = findViewById(R.id.atbu1);
        attextView1 = findViewById(R.id.atxianshi);
        atbutton11 = findViewById(R.id.atbutton1);
    }
    public void onClick(View view){
        if(view.getId() == R.id.atbu1){
            float temp = Float.parseFloat(ateditText1.getText().toString());
            float result = 0;
            String str = "";
            if(atradioButton1.isChecked()){
                result = (float)(5.0/9.0*(temp - 32));
                str = "对应的摄氏温度为：" + String.format("%.1f", result);
            }else if(atradioButton2.isChecked()){
                result = (float)(9.0/5.0*(temp + 32));
                str = "对应的华氏温度为：" + String.format("%.1f", result);
            }
            attextView1.setText(str);
        }else if(view.getId() == R.id.atbutton1){
            Intent intent = new Intent(ActivityTemp.this, com.example.yang.chapter3androidbyown.Activity1.class);
            startActivity(intent);
        }
    }
}
