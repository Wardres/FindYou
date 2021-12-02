package com.example.findyou.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DB = "mydb.db";
    private static final int VERSION = 1;
    private Context context;

    private static final String TABLA = "usuarios";
    private static final String COL_EMAIL = "email";
    private static final String COL_PASS = "pass";


    public DataBaseHelper(@Nullable Context context) {
        super(context, DB, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE "+TABLA+" (id INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_EMAIL+" TEXT NOT NULL, "+COL_PASS+" TEXT NOT NULL);";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "DROP TABLE IF EXISTS "+TABLA;
        db.execSQL(sql);
        onCreate(db);

    }
}
