package com.example.yang.chapter5sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MyHelper myHelper;
    private EditText mEtName;
    private EditText mEtPhone;
    private TextView mTvShow;
    private Button mBtnAdd;
    private Button mBtnQuery;
    private Button mBtnUpdate;
    private Button mBtnDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myHelper = new MyHelper(this);
        init();
    }
    private void init(){
        mEtName = findViewById(R.id.et_name);
        mEtPhone = findViewById(R.id.et_phone);
        mTvShow = findViewById(R.id.tv_show);
        mBtnAdd = findViewById(R.id.btn_add);
        mBtnQuery = findViewById(R.id.btn_query);
        mBtnUpdate = findViewById(R.id.btn_update);
        mBtnDelete = findViewById(R.id.btn_delete);
        mBtnAdd.setOnClickListener(this);
        mBtnQuery.setOnClickListener(this);
        mBtnUpdate.setOnClickListener(this);
        mBtnDelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_add:
                ButtonOnClick.add(mEtName, mEtPhone, myHelper);
                Toast.makeText(this, "信息已添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_query:
                ButtonOnClick.query(myHelper, mTvShow);
                break;
            case R.id.btn_update:
                ButtonOnClick.update(myHelper, mEtPhone, mEtName);
                Toast.makeText(this, "信息已修改", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_delete:
                ButtonOnClick.delete(myHelper, mTvShow);
                Toast.makeText(this, "信息已删除", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
