package com.bookreader.model.entity;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {

	private String name;
	private String author;
	private String catalog;
	private String path;
	private List<BookMark> bookmarks;
	
	public Book(String name, String author,String catalog,String path)
	{
		this.name = name;
		this.name = author;
		this.catalog = catalog;
		this.path = path;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.name = author;
	}
	
	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	//添加书签
	public boolean addBookmarks(BookMark bookmark) 
	{   
		for(int i=0;i<bookmarks.size();i++)
		{
		if(bookmarks.get(i).equals("bookmark"))
		 return false; 
		}
		bookmarks.add(bookmark);
		return true;
	}
//删除书签
	public boolean delBookmark(List<BookMark> bookmarks) {
		
		for(int i=0;i<bookmarks.size();i++)
		{
		if(bookmarks.get(i).equals(bookmarks))
		{
			bookmarks.remove(bookmarks.get(i));
		   return true;
		}
		}
		return false;
		 
	}
	//清空书签
	public void delallBookmark(List<BookMark> bookmarks)
	{
		
		bookmarks.clear();
	}
	
}
