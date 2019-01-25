package com.example.yang.chapter3androidbyown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Activity3 extends AppCompatActivity {

    private Button a3bu1;
    private Button a3bu2;
    private Button a3bu3;
    private EditText a3et;
    private int number = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        a3bu1 = findViewById(R.id.a3bu1);
        a3bu2 = findViewById(R.id.a3bu2);
        a3bu3 = findViewById(R.id.a3bu3);
        a3et = findViewById(R.id.a3et);

        a3bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                create();
            }
        });
        a3bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });
        a3bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3.this, com.example.yang.chapter3androidbyown.Activity1.class);
                startActivity(intent);
            }
        });
    }
    private void create(){
        Random random = new Random();
        number = random.nextInt(100);
    }
    private void check(){
        int guess = 0;
        guess = Integer.parseInt(a3et.getText().toString());
        if (guess == number){
            Toast.makeText(this, "恭喜你，答对了！", Toast.LENGTH_SHORT).show();
        }else if(guess > number){
            Toast.makeText(this, "您输入的数字大了！", Toast.LENGTH_LONG).show();
        }else if(guess < number){
            Toast.makeText(this, "您输入的数字小了！", Toast.LENGTH_SHORT).show();
        }
    }
}
