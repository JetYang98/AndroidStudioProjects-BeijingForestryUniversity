package com.example.yang.chapter5android;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
        button = findViewById(R.id.bu1);
        button.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog dialog;
        dialog = new AlertDialog.Builder(this).setTitle("Dialog对话框")
                .setMessage("What are we gonna do?")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Learning", null)
                .create();
        dialog.show();
    }
}
