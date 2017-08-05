package com.example.jcastako.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jcastako on 5/08/17.
 */

public class DbHelper extends SQLiteOpenHelper {



    String sql = "CREATE TABLE Cursos (Id text primary key, nombre text not null);";


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Cursos");
        db.execSQL(sql);


    }
}
