package com.example.ventiapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context){
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user(email text primary key,password text,UserName text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");

    }
    //Inserting data in the database
    public boolean insert(String UserName, String email, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("UserName", UserName );
        contentValues.put("email", email);
        contentValues.put("password", password);
        long ins = db.insert("user", null,contentValues);
        if (ins== -1) return  false;
        else return true;

    }
    // checking if the email exists
    public Boolean chkemail(String email){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db. rawQuery("Select * from user where email =?",new String[]{email});
        if (cursor.getCount()>0) return false;
            else return true;
    }
}
