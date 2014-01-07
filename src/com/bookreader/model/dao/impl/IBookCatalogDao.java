package com.bookreader.model.dao.impl;
import com.bookreader.model.entity.BookCatalog;
public interface IBookCatalogDao {
	public void addbookcatalog(BookCatalog book);
    public void delbookcatalog(BookCatalog book);
    public void findbookcatalog(BookCatalog book);
    public void mdbookcatalog(BookCatalog book);
}
