package com.bookreader.model.service;
import com.bookreader.model.dao.BookDao;
import com.bookreader.model.entity.Book;

public class Addbookservice {
	
public	BookDao bookdao;
public void addbookservice(Book book)
{
	bookdao.addbook(book);
}
	
}
