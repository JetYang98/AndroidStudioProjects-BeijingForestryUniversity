package com.example.yang.chapter5sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yang on 2018/6/22.
 */

public class ButtonOnClick {

    private static String name;
    private static String phone;
    private static SQLiteDatabase db;
    private static ContentValues values;

    public static void add(EditText mEtName, EditText mEtPhone, MyHelper myHelper){
        name = mEtName.getText().toString();
        phone = mEtPhone.getText().toString();
        db = myHelper.getWritableDatabase();
        values = new ContentValues();
        values.put("name", name);
        values.put("phone", phone);
        db.insert("information", null, values);
        db.close();
    }
    public static void query(MyHelper myHelper, TextView mTvShow){
        db = myHelper.getReadableDatabase();
        Cursor cursor = db.query("information", null, null, null, null, null, null);
        if(cursor.getCount() == 0){
            mTvShow.setText("");
//            Toast.makeText(this, "没有数据", Toast.LENGTH_SHORT).show();
        }else{
            cursor.moveToFirst();
            mTvShow.setText("Name: " + cursor.getString(1) + " ; Tel: " + cursor.getString(2));
        }
        while (cursor.moveToNext()){
            mTvShow.append("\n" + "Name: " + cursor.getString(1) + " ; Tel: " + cursor.getString(2));
        }
        cursor.close();
        db.close();
    }
    public static void update(MyHelper myHelper, EditText mEtPhone, EditText mEtName){
        db = myHelper.getWritableDatabase();
        values = new ContentValues();
        values.put("phone", phone = mEtPhone.getText().toString());
        db.update("information", values, "name=?", new String[]{mEtName.getText().toString()});
        db.close();
    }
    public static void delete(MyHelper myHelper, TextView mTvShow){
        db = myHelper.getWritableDatabase();
        db.delete("information", null, null);
        mTvShow.setText("");
        db.close();
    }
}
