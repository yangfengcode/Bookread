package com.bookreader.model.entity;
import java.util.List;
import java.io.Serializable;

public class BookCatalog implements Serializable{
private String name;
private List<Book> books;
public BookCatalog(String name)
{
	this.name=name;
}
//获取书
public Book getbook(String bookname)
{
	for(int i=0;i<books.size();i++)
	{
	if(books.get(i).getName().equals(bookname))
		return books.get(i);
	}
	return null;
	
}

//添加书

public boolean addbook(Book book)
{
	for(int i=0;i<books.size();i++)
	{
	if(books.get(i).getName().equals(name))
	 return false; 
	}
	books.add(book);
	return true;
}
//删除书
public boolean delbook(String bookname)
{
	for(int i=0;i<books.size();i++)
	{
	if(books.get(i).getName().equals(bookname))
	{
		books.remove(books.get(i));
	   return true;
	}
	}
	return false;
}
//栏目清空
public void delallbook()
{
	books.clear();
}

public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}

public List<Book> getBooks()
{
	return books;
}

public void setBooks(List<Book> books)
{
	this.books=books;
}


}
