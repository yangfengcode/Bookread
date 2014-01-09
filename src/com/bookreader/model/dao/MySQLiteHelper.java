package com.bookreader.model.dao;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.database.SQLException;

import com.bookreader.params.Constant;

public class MySQLiteHelper extends SQLiteOpenHelper {

	
	public MySQLiteHelper(Context c) {
		super(c, Constant.DB_NAME, null, Constant.DB_VERSION);
	}
		
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.v("debug", "start create table");
		db.execSQL(Constant.CREATE_TABLE_BOOK);
		db.execSQL(Constant.CREATE_TABLE_BOOK_MARK);
		db.execSQL(Constant.CREATE_TABLE_BOOK_RECORD);
		db.execSQL(Constant.CREATE_TABLE_BOOK_CATALOG);
		
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	

}
