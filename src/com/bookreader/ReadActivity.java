package com.bookreader;

import android.app.Activity;
 import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.bookreader.view.BorderScrollView;
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import  com.bookreader.util.*;
public class ReadActivity extends Activity {
	public BorderScrollView contentScroll;
	     public TextView contentTv;
	
	     private BufferedReader br;
	 
	    private Context context;
	 
	     public boolean isLoading;
	
	 
	     /**
	     * Called when the activity is first created.
	     */
	     @Override
	     public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	         setContentView(R.layout.activity_read);
	        context = this;
	 
	         contentTv = (TextView) findViewById(R.id.content);
	        contentScroll = (BorderScrollView) findViewById(R.id.contentScroll);
	         
	        // ×¢²á¸ÕÐ´µÄ¹ö¶¯¼àÌýÆ÷
	         contentScroll.setOnScrollChangedListener(new OnScrollChangedListenerSimple(){
	            @Override
	             public void onScrollBottom() {
	                synchronized (ReadActivity.class){
	                     if(!isLoading){
	                         isLoading = true;
	                         new AsyncTextLoadTask(context, br).execute();
	                     }
	                }
             }
	         });
	 
	         try{
	            InputStream is = context.getAssets().open("bngd.txt");
	             br = new BufferedReader(new InputStreamReader(is));
	 
	             new AsyncTextLoadTask(context, br).execute();
	 
	         }catch(Exception ex){
	            ex.printStackTrace();
	         }
	
	
	     }
	 
	 
	    @Override
	     protected void onDestroy() {
	        super.onDestroy();
	        if(null != br){
	            try {
	                br.close();
	             } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	     }
}
