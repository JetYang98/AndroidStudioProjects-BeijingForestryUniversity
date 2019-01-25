package com.example.yang.chapter6broadcastreceiver;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et_ipnumber;
    private SharedPreferences sp;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_ipnumber = findViewById(R.id.et_ipnumber);
        button = findViewById(R.id.bu);
        button.setOnClickListener(this);
        sp = getSharedPreferences("config", MODE_PRIVATE);

    }
    @Override
    public void onClick(View view) {
        String number = et_ipnumber.getText().toString().trim();
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("number", number);
        editor.commit();
        Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
    }
}
