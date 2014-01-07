package com.bookreader.model.dao.impl;

import com.bookreader.model.entity.BookMark;

public interface IBookMarkDao {
	public void addbookmark(BookMark bookmark);
    public void delbookmark(BookMark bookmark);
    public void findbookmark(BookMark bookmark);
    public void mdbookmark(BookMark bookmark);
    public void clearbookmark(BookMark bookmark);
}
