package com.bookreader.model.entity;
import java.io.Serializable;

public class BookCatalog implements Serializable{
private String name;

public BookCatalog(String name)
{
	this.name=name;
}
//��ȡ���б�
public void getbooklist()
{
	}
//��ȡ��
public void getbook(String bookname)
{
	
	
}

//�����

public void addbook(Book book)
{
	
}
//ɾ����
public void delbook(String bookname)
{
	
}
//��Ŀ���
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
