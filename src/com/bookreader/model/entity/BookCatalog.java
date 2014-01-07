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
//��ȡ��
public Book getbook(String bookname)
{
	for(int i=0;i<books.size();i++)
	{
	if(books.get(i).getName().equals(bookname))
		return books.get(i);
	}
	return null;
	
}

//�����

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
//ɾ����
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
//��Ŀ���
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
