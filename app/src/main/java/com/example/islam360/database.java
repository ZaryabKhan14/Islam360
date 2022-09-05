package com.example.islam360;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {


    public database(@Nullable Context context) {
        super(context, "quran.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table tbl_QuranComplete (id INTEGER NOT NULL primary key autoincrement,surat_id INTEGER NOT NULL,para_id INTEGER NOT NULL, ayat_number INTEGER NOT NULL,translation_urdu TEXT DEFAULT null,arabic TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL("drop table if exists tbl_QuranComplete");
    }

    public void insert( String suratid,String paraid,String ayatnum,String translaturdu,String arabic){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues ayat = new ContentValues();
        ayat.put("surat_id",suratid);
        ayat.put("para_id",paraid);
        ayat.put("ayat_number",ayatnum);
        ayat.put("translation_urdu",translaturdu);
        ayat.put("arabic",arabic);
        db.insert("tbl_QuranComplete",null,ayat);

    }

    public Cursor idfetchkaro(){

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor zaryab = db.rawQuery("select * from tbl_QuranComplete",null);
        return zaryab;
    }
}
