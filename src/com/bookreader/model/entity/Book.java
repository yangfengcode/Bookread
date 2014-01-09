package com.bookreader.model.entity;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {

	private String name;
	private String author;
	private String catalog;
	private String path;
	
	
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
	public void addBookmarks(BookMark bookmark) 
	{   
		
	}
//删除书签
	public boolean delBookmark() {
		
		return false;
		 
	}
	//清空书签
	public void delallBookmark()
	{
		
	}
	
}
