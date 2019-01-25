package com.example.yang.chapter3android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    private void init(){
        button = findViewById(R.id.bu1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /*Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("content", "This is MainActivity calling Main2Activity.");
        startActivity(intent);*/
        Intent intent = new Intent();
        intent.setAction("myAction");
        intent.putExtra("content", "This is MainActivity calling Main2Activity.");
        startActivity(intent);
    }
}
