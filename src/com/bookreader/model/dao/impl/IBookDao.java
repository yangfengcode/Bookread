package com.bookreader.model.dao.impl;

import com.bookreader.model.entity.Book;

public interface IBookDao {
	public void addbook(Book book);
    public void delbook(Book book);
    public void findbook(Book book);
    public void mdbook(Book book);
}
