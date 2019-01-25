package com.example.yang.chapter4android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private EditText editText1;
    private EditText editText2;
    private TextView xian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        button1 = findViewById(R.id.bu1);
        button2 = findViewById(R.id.bu2);
        editText1 = findViewById(R.id.edit1);
        editText2 = findViewById(R.id.edit2);
        xian = findViewById(R.id.xianshi);
    }
    public void onClick(View view){
        double total, money;
        String x,y;
        int year;
        double profit = 0;
        x = editText1.getText().toString();
        y = editText2.getText().toString();
        money = Double.parseDouble(x);
        year = Integer.parseInt(y);
        switch(view.getId()){
            case R.id.bu1:
                switch (year){
                    case 0:
                        profit = 0;
                        break;
                    case 1:
                        profit = 0.0255;
                        break;
                    case 3:
                    case 4:
                        profit = 0.0324;
                        break;
                    case 5:
                        profit = 0.036;
                        break;
                    default:
                        profit = 0.036;
                        break;
                }
                total = money * Math.pow(1 + profit, year);
                xian.setText("本金加利息一共：\n\t\n\t" + (float)total + "元");
                break;
            case R.id.bu2:
                xian.setText("");
                editText1.setText("");
                editText2.setText("");
                break;
            default:
                break;
        }
    }
}
