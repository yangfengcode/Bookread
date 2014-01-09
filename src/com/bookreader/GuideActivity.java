package com.bookreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
public class GuideActivity extends Activity implements OnGestureListener,
		OnTouchListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
	}
	
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	final int FLING_MIN_DISTANCE = 100, FLING_MIN_VELOCITY = 200; 
	 static int i=1; 
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
         
		if (e1.getX() - e2.getX() > FLING_MIN_DISTANCE && Math.abs(velocityX) > FLING_MIN_VELOCITY) {      
			  
			// Fling left   
			LinearLayout ll=(LinearLayout) findViewById(R.id.bg);
			if(i<=4)
			{
				i++;
				switch(i)
				{
			case 2:ll.setBackgroundResource(R.drawable.g2);
			case 3:ll.setBackgroundResource(R.drawable.g3);
			case 4:ll.setBackgroundResource(R.drawable.g4);
			case 5:ll.setBackgroundResource(R.drawable.g5);
				}		
			}
			     } else if (e2.getX() - e1.getX() > FLING_MIN_DISTANCE && Math.abs(velocityX) > FLING_MIN_VELOCITY) {      
			  
			// Fling right   
			    	 LinearLayout  ll= (LinearLayout) findViewById(R.id.bg);
			    	 if(i>=1)
						{
							i--;
							switch(i)
							{
						case 1:ll.setBackgroundResource(R.drawable.g1);
						case 2:ll.setBackgroundResource(R.drawable.g2);
						case 3:ll.setBackgroundResource(R.drawable.g3);
						case 4:ll.setBackgroundResource(R.drawable.g4);
						
							}		
						}  
			  
			     }      
			     return  false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

}