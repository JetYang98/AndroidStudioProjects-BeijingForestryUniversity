package com.example.yang.chapter3androidbyown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    private TextView a4tv1;
    private Button a4bu1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        a4tv1 = findViewById(R.id.a4tv1);
        a4bu1 = findViewById(R.id.a4bu1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("et");
        a4tv1.setText(name);
        a4bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Activity4.this, com.example.yang.chapter3androidbyown.Activity1.class);
                startActivity(intent1);
            }
        });
    }
}
