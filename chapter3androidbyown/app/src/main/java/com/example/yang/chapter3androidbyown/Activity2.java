package com.example.yang.chapter3androidbyown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button a2bu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        a2bu1 = findViewById(R.id.a2bu1);

        a2bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2.this, com.example.yang.chapter3androidbyown.Activity1.class);
                startActivity(intent);
            }
        });
    }
}
