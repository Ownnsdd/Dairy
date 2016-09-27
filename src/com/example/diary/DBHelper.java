package com.example.diary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{
	public static final String DATABASE_NAME = "diary.db";
	public static final int VERSION = 1;
	
	public DBHelper(Context context){
		super(context, DATABASE_NAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// int: year, month, date String: txt, day 
		db.execSQL("create table if not exists diary(_id integer primary key autoincrement,year integer not null,month integer not null,date integer not null,day text not null,txt text not null)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}
