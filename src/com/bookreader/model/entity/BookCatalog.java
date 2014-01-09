package com.bookreader.model.entity;
import java.io.Serializable;

public class BookCatalog implements Serializable{
private String name;

public BookCatalog(String name)
{
	this.name=name;
}
//获取书列表
public void getbooklist()
{
	}
//获取书
public void getbook(String bookname)
{
	
	
}

//添加书

public void addbook(Book book)
{
	
}
//删除书
public void delbook(String bookname)
{
	
}
//栏目清空
public void delallbook()
{
	
}

public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}

}
