package com.bookreader.model.entity;

import java.io.Serializable;
import  java.util.Date;

public class BookRecord implements Serializable {
	
	
		private String name;
		private int page;
		private int x;
		private int y;
		long  time;
	
		public BookRecord()
		{}
		public BookRecord(String name,int page,int x,int y,long time)
        {  
            this. name=name ;  
            this.page = page;
            this. time= time;  
            this.x = x;
            this.y = y;
            
        }  
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}

		public int getPage()
		{
			return page;
		}
		public void setPage(int page)
		{
			this.page=page;
		}

		public int getX()
		{
			return x;
		}
		public void setX(int x)
		{
			this.x=x;
		}

		public int getY()
		{
			return y;
		}
		public void setY(int y)
		{
			this.y=y;
		}

		public long getTime()
		{
			Date date = new Date();
			return date.getTime();
		}
		
		public void setTime(Date date)
		{
			time=date.getTime();
		} 
}
