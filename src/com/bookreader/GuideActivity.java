package com.bookreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class GuideActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
		
		super.onDestroy();
		Intent intent=new Intent();
		intent.setClass(GuideActivity.this, Mainmenu.class);  
        startActivity(intent);  
        finish();
	}
	
}
