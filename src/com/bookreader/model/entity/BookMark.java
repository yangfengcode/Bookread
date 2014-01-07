package com.bookreader.model.entity;

import java.io.Serializable;

public class BookMark implements Serializable {
private	int id;
private String name;
private int page;
private int x;
private int y;

public BookMark(int id,String name,int page,int x,int y)
{
	this.name=name;
	this.page=page;
	this.x=x;
	this.y=y;
	this.id=id;
}

public int getId()
{
	return id;
}

public void setId(int id)
{
	this.id=id;

}

public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}

public int getPage()
{
	return page;
}
public void setPage(int page)
{
	this.page=page;
}

public int getX()
{
	return x;
}
public void setX(int x)
{
	this.x=x;
}

public int getY()
{
	return y;
}
public void setY(int y)
{
	this.y=y;
}

}
