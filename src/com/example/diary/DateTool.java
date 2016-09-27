package com.example.diary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
	private Date date;
	SimpleDateFormat formatter;
	
	public DateTool(Date date) {
		// TODO Auto-generated constructor stub
		this.date=date;
	}
	
	
	public int getDay(){
		formatter=new SimpleDateFormat("dd");
		return Integer.valueOf(formatter.format(date));
	}
	
	public int getMonth(){
		formatter=new SimpleDateFormat("MM");
		return Integer.valueOf(formatter.format(date));
	}
	
	public int getYear(){
		formatter=new SimpleDateFormat("yyyy");
		return Integer.valueOf(formatter.format(date));
	}
	
	public String getDayOfWeek(){
		formatter=new SimpleDateFormat("E");
		return formatter.format(date);
	}
	
	public String getHeadding(){
		formatter=new SimpleDateFormat("E dd/MM/yyyy");
		return formatter.format(date);
	}
}
