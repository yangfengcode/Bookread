package com.bookreader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//实现开机动画
public class AnimatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animat);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.animat, menu);
		return true;
	}

}
