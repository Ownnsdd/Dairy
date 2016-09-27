package com.example.diary;

import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends Activity {
	private Button done_btn;
	private TextView Time;
	private EditText editText;
	private Date now_date;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);
		
		done_btn = (Button) findViewById(R.id.done_btn);
		Time = (TextView) findViewById(R.id.new_head);
		editText = (EditText) findViewById(R.id.new_dairy);
		
		now_date = new Date(System.currentTimeMillis());
		DateTool dTool=new DateTool(now_date);
		Time.setText(dTool.getHeadding());
		
		done_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				now_date = new Date(System.currentTimeMillis());
				DateTool dTool=new DateTool(now_date);
				String txt = editText.getText().toString();
				String day = dTool.getDayOfWeek();
				int year = dTool.getYear();
				int month = dTool.getMonth();
				int date = dTool.getDay();
				Diary diary = new Diary(txt, date, month, year, day);
				DiaryTool diaryTool = new DiaryTool(EditActivity.this);
				if(!txt.isEmpty())diaryTool.save(diary);
				finish();
			}
		});
	}
}
