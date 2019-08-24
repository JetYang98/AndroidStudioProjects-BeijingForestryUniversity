package com.example.yang.chapter3intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button bu1;
    private Button bu2;
    private EditText edit;
    private Button bu3;
    private EditText edit2;
    private EditText edit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu1 = findViewById(R.id.bu1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://192.168.1.14");
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(uri);
                startActivity(intent);
            }
        });
        edit = findViewById(R.id.edit);
        bu2 = findViewById(R.id.bu2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = edit.getText().toString();
                Uri uri = Uri.parse("tel:" + string);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(uri);
                startActivity(intent);
            }
        });
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        bu3 = findViewById(R.id.bu3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telStr = edit2.getText().toString();
                String note = edit3.getText().toString();
                Uri uri = Uri.parse("smsto:" + telStr);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body", note);
                intent.setType("vnd.android_dir/mms-sms");
                intent.setData(uri);
                startActivity(intent);
            }
        });

    }
}
