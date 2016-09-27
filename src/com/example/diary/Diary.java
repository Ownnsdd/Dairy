package com.example.diary;

import java.util.Date;

import android.R.integer;

public class Diary {
	private String txt,day;
	private int date,month,year;
	
	
	public Diary(String txt,int date,int month,int year,String day){
		this.txt = txt;
		this.date = date;
		this.month = month;
		this.year = year;
		this.day = day;
	}
	
	public String getText(){
		return txt;
	}
	
	public int getDate(){
		return date;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getDay(){
		return day;
	}
	
}
