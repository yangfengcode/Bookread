package com.bookreader;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.*;
import android.os.Handler;
//实现开机动画
public class AnimatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animat);
		
		
		 new Handler().postDelayed(new Runnable()
		 {
			 public void run() {  
				 ImageView imageview1 = (ImageView) findViewById(R.id.imageView1);
				 imageview1.setBackgroundResource(R.drawable.duola);
				 AnimationDrawable duolaAnimation;
				 duolaAnimation = (AnimationDrawable) imageview1.getBackground(); 
				 duolaAnimation.start();
             }  
			 
		 }, 2000);  
		 
		 
		
		 
		 
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
