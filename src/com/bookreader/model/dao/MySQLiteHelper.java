package com.bookreader.model.dao;
import com.bookreader.params.Constant;
import com.bookreader.model.entity.*;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class MySQLiteHelper extends SQLiteOpenHelper {


	       
	    private SQLiteDatabase db;  
	    MySQLiteHelper(Context c) {  
	        super(c, "BOOKREADER", null, 2);  
	    }  
	    @Override  
	    public void onCreate(SQLiteDatabase db) {  
	        this.db = db;  
	        db.execSQL(Constant.BOOK_TABLE_NAME); 
	        db.execSQL(Constant.BOOK_MARK_TABLE_NAME);
	        db.execSQL(Constant.BOOK_CATALOG_TABLE_NAME);
	        db.execSQL(Constant.BOOK_RECORD_TABLE_NAME);
	   
	    }  
	    public void insertbook(Book book) {  
	        SQLiteDatabase db = getWritableDatabase();  
	        //db.insert();  
	        db.close();  
	    }  
	    public void clearbook()
	    {
	    	
	    	
	    }
	    
	    public void bookquery() {  
	         
	    }  
	    public void delbook(int id) {  
	        if (db == null)  
	            db = getWritableDatabase();  
	        //db.delete();  
	    }  
	    
	    
	    
	    
	    
	    
	    
	    public void insertbookmark(Book book) {  
	        SQLiteDatabase db = getWritableDatabase();  
	        //db.insert();  
	        db.close();  
	    }  
	    public void clearbookmark()
	    {
	    	
	    	
	    }
	    
	    public void bookmarkquery() {  
	         
	    }  
	    public void delbookmark(int id) {  
	        if (db == null)  
	            db = getWritableDatabase();  
	        //db.delete();  
	    }  
	    
	    
	    
	    
	    
	    
	    public void insertcatalog(Book book) {  
	        SQLiteDatabase db = getWritableDatabase();  
	        //db.insert();  
	        db.close();  
	    }  
	    public void clearcatalog()
	    {
	    	
	    	
	    }
	    
	    public void querycatalog() {  
	         
	    }  
	    public void delcatalog(int id) {  
	        if (db == null)  
	            db = getWritableDatabase();  
	        //db.delete();  
	    }  
	    
	    
	    
	    
	    
	    
	    public void insertbookrecord(Book book) {  
	        SQLiteDatabase db = getWritableDatabase();  
	        //db.insert();  
	        db.close();  
	    }  
	    public void clearbookrecord()
	    {
	    	
	    	
	    }
	    
	    public void querybookrecord() {  
	         
	    }  
	    public void delbookrecord(int id) {  
	        if (db == null)  
	            db = getWritableDatabase();  
	        //db.delete();  
	    }  
	    
	    
	    
	    
	    
	    
	    
	    public void close() {  
	        if (db != null)  
	            db.close();  
	    }  
	    
	    @Override  
	    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {  
	    }  

}
