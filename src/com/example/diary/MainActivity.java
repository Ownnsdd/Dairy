package com.example.diary;

import java.text.SimpleDateFormat;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button newbtn;
	private ListView show1_list;
	private Cursor c;
	private SimpleCursorAdapter simpleCursorAdapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        newbtn = (Button)findViewById(R.id.add_today_btn);
        show1_list = (ListView) findViewById(R.id.show1_list);

        showlist();
        
        newbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,EditActivity.class);
				startActivity(intent);
			}
		});
    }
    
    public void showlist(){
    	DiaryTool dTool = new DiaryTool(this);
    	c = dTool.getDiary();
    	simpleCursorAdapter = new SimpleCursorAdapter(
    			MainActivity.this,
    			R.layout.show_1,
    			c,new String[]{"day","date","txt"},
    			new int[]{R.id.s1_week,R.id.s1_date,R.id.s1_diary},0
    			);
    	show1_list.setAdapter(simpleCursorAdapter);
    }
    
}
