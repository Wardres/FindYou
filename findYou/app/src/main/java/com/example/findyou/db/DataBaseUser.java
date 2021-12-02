package com.example.findyou.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DataBaseUser extends DataBaseHelper {

    private Context context;

    public DataBaseUser(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public boolean insertUser(String email_fromLogin, String pass_fromlogin) {

        SQLiteDatabase dataBaseHelper = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("email", email_fromLogin);
        cv.put("pass", pass_fromlogin);
        long insert = dataBaseHelper.insert("usuarios", null, cv);

        if (insert != -1) {
            return true;
        } else {
            return false;
        }


    }

    public boolean isUserRegister(String email) {
        String sql = "SELECT * FROM usuarios WHERE email = ? ";

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery(sql, new String[]{email});

        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isPassOk(String email, String pass){
        String sql = "SELECT * FROM usuarios WHERE email = ? and pass = ? ";

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery(sql, new String[]{email,pass});

        if (cursor.getCount() > 0) {
            return true;
        } else {
            return false;
        }
    }









}
