package com.bookreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Mainmenu extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainmenu);
		
		 Button Btn1 = (Button)findViewById(R.id.button1);//��ȡ��ť��Դ    
	        Btn1.setOnClickListener(new Button.OnClickListener(){//��������    
	            public void onClick(View v) {   
	            	Intent intent=new Intent();
	        		intent.setClass(Mainmenu.this, BooklistActivity.class);  
	                startActivity(intent);  
	                finish();  
	            	
	            }   
	        });  
	        
	        Button Btn2 = (Button)findViewById(R.id.button2);//��ȡ��ť��Դ    
	        Btn2.setOnClickListener(new Button.OnClickListener(){//��������    
	            public void onClick(View v) {   
	            	Intent intent=new Intent();
	        		intent.setClass(Mainmenu.this, CatalogActivity.class);  
	                startActivity(intent);  
	                finish();  
	            	
	            }   
	        });   
	        
	        Button Btn3 = (Button)findViewById(R.id.button3);//��ȡ��ť��Դ    
	        Btn3.setOnClickListener(new Button.OnClickListener(){//��������    
	            public void onClick(View v) {   
	            	Intent intent=new Intent();
	        		intent.setClass(Mainmenu.this, BookrecordActivity.class);  
	                startActivity(intent);  
	                finish();  
	            	
	            }   
	        });   
	        
	        
	        Button Btn4 = (Button)findViewById(R.id.button4);//��ȡ��ť��Դ    
	        Btn4.setOnClickListener(new Button.OnClickListener(){//��������    
	            public void onClick(View v) {   
	            	Intent intent=new Intent();
	        		intent.setClass(Mainmenu.this, BookmarkActivity.class);  
	                startActivity(intent);  
	                finish();  
	            	
	            }   
	        });   
	        
	        Button Btn5 = (Button)findViewById(R.id.button5);//��ȡ��ť��Դ    
	        Btn4.setOnClickListener(new Button.OnClickListener(){//��������    
	            public void onClick(View v) {   
	            	
	            	
	            }   
	        });   
	        
	        
	        
            }
	}