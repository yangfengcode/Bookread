package com.bookreader;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//ʵ�ֿ�������
public class AnimatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animat);
		
		Intent intent=new Intent();
		intent.setClass(AnimatActivity.this, GuideActivity.class);  
        startActivity(intent);  
        finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.animat, menu);
		return true;
	}

}
