package com.bookreader.model.service;
import com.bookreader.model.dao.BookDao;
import com.bookreader.model.entity.Book;
import com.bookreader.model.entity.BookMark;
import com.bookreader.model.dao.BookMarkDao;

public class Delbookservice {
	
	public	BookDao bookdao;
	public	BookMarkDao bookmarkdao;
	
	public void delbookservice(Book book,BookMark bookmark)
	{
		bookdao.delbook(book);
		bookmarkdao.delbookmark(bookmark);
	}
}
