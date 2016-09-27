package com.example.diary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DiaryTool {
	private DBHelper dbHelper;
	private SQLiteDatabase sqLiteDatabase;
	
	public DiaryTool(Context context){
		dbHelper = new DBHelper(context);
	}
	
	public void save(Diary diary){
		ContentValues values = new ContentValues();
		values.put("year",diary.getYear());
		values.put("month",diary.getMonth());
		values.put("date",diary.getDate());
		values.put("day",diary.getDay());
		values.put("txt",diary.getText());
		sqLiteDatabase = dbHelper.getWritableDatabase();
		sqLiteDatabase.insert("diary", null, values);
		values.clear();
	}
	
	public Cursor getDiary(){
		sqLiteDatabase = dbHelper.getReadableDatabase();
		Cursor cursor = sqLiteDatabase.rawQuery("select * from diary", null);
		return cursor;
	}
	
}
