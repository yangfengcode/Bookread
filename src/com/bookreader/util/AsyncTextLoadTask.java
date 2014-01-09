package com.bookreader.util;

import android.os.AsyncTask;
 import android.content.Context;
 import android.os.Handler;
 import com.bookreader.ReadActivity;

 import java.io.*;

public class AsyncTextLoadTask extends AsyncTask<Object, String, String> {
	private Context context;
	     private ReadActivity activity;
	     private BufferedReader br;
	 
	     public AsyncTextLoadTask(Context context, BufferedReader br) {
	         this.context = context;
	         this.br = br;
	         activity = (ReadActivity)context;
	     }
	 
	     @Override
	     protected String doInBackground(Object... params) {
	        StringBuilder paragraph = new StringBuilder();
	         try {
	 
	            String line = "";
	 
	            int index = 0;
	             while(index < 50 && (line = br.readLine()) != null){
	                 paragraph.append(line + "\n");
	                index++;
	             }
	 
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	 
	         return paragraph.toString();
	     }
	 
	 
	     @Override
	     protected void onPreExecute() {
	         super.onPreExecute();
	     }
	 
	     @Override
	     protected void onPostExecute(String result) {
	         super.onPostExecute(result);
	         activity.contentTv.setText(result);
	        new Handler().postDelayed(new Runnable() {
	 
	             @Override
	             public void run() {
	                 activity.contentScroll.scrollTo(0, 0); // 记载完新数据后滚动到顶部
	             }
	         }, 100);
	         activity.isLoading = false;
	     }
}
