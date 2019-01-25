package com.example.yang.chapter3androidbyown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    private Button a1bu1;
    private Button a1bu2;
    private Button a1bu3;
    private Button a1bu4;
    private EditText a1et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        a1bu1 = findViewById(R.id.a1bu1);
        a1bu2 = findViewById(R.id.a1bu2);
        a1bu3 = findViewById(R.id.a1bu3);
        a1bu4 = findViewById(R.id.a1bu4);
        a1et = findViewById(R.id.a1et);

        a1bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }
        });
        a1bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, ActivityTemp.class);
                startActivity(intent);
            }
        });
        a1bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity3.class);
                startActivity(intent);
            }
        });
        a1bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, Activity4.class);
                intent.putExtra("et", a1et.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}
