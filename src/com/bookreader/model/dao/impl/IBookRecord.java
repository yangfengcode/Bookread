package com.bookreader.model.dao.impl;

import com.bookreader.model.entity.BookRecord;

public interface IBookRecord {
	public void addbookrecord(BookRecord bookrecord);
    public void delbookrecord(BookRecord bookrecord);
    public void findbookrecord(BookRecord bookrecord);
    public void mdbookrecord(BookRecord bookrecord);
    public void clearbookrecord(BookRecord bookrecord);
}
