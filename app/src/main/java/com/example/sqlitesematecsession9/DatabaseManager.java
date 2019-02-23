package com.example.sqlitesematecsession9;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseManager extends SQLiteOpenHelper {


    final static String DatabaseName = "myinfo.db";
    final static int Version = 1;
    final static String tableName = "tbl_staff";
    final static String dID = "id";
    final static String dName = "name";
    final static String dLastName = "family";


    public DatabaseManager(@Nullable Context cnt) {
        super(cnt, DatabaseName, null, Version);
    }

    @Override
    public void onCreate(SQLiteDatabase cdb) {

        String cQuery = "CREATE TABLE " + tableName + " ( " + dID + " INTEGER PRIMARY KEY, " + dName + " TEXT, " + dLastName + " TEXT );";
        cdb.execSQL(cQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertPerson(Person iprs) {
        SQLiteDatabase idb = this.getWritableDatabase();
        ContentValues icv = new ContentValues();
        icv.put(dID, iprs.pID);
        icv.put(dName, iprs.pName);
        icv.put(dLastName, iprs.pFamily);

        idb.insert(tableName, null, icv);
        idb.close();
    }

}
