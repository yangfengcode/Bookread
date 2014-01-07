package com.bookreader.model.entity;

import java.io.Serializable;
import  java.util.Date;

public class BookRecord implements Serializable {
	//链队列先进先出，可清空	
	public class Node
	{
		private String name;
		private int page;
		private int x;
		private int y;
		long time;
		Node next;
		public Node()
		{}
		public Node(String name,int page,int x,int y,long time,Node next)
        {  
            this. name=name ;  
            this.page = page;
            this. time= time;  
            this.x = x;
            this.y = y;
            this.next=next;
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

		public long getTime()
		{
			Date date = new Date();
			return date.getTime();
		}
		
		public void setTime(Date date)
		{
			time=date.getTime();
		}
	}
	
	
	//保存该链队列的头节点  
    private Node front;  
    //保存该链队列的尾节点  
    private Node rear;  
    //保存该链队列中已包含的节点数  
    private int size;  
	
    public BookRecord()  
    {  
        //空链队列，front和rear都是null  
        front = null;  
        rear = null;  
    }  
    //以指定数据元素来创建链队列，该链队列只有一个元素  
    public BookRecord(String name,int page,int x,int y,long time)  
    {  
        front = new Node(name,page,x,y,time,null);  
        //只有一个节点，front、rear都指向该节点  
        rear = front;  
        size++;  
    }  
    //返回链队列的长度    
    public int length()  
    {  
        return size;  
    }  
    //将新元素加入队列  
    public void add(String name,int page,int x,int y,long time)  
    {  
        //如果该链队列还是空链队列  
        if (front == null)  
        {  
            front = new Node(name,page,x,y,time,null);  
            //只有一个节点，front、rear都指向该节点  
            rear = front;  
        }  
        else  
        {  
            //创建新节点  
            Node newNode = new Node(name,page,x,y,time,null);  
            //让尾节点的next指向新增的节点  
            rear.next = newNode;  
            //以新节点作为新的尾节点  
            rear = newNode;  
        }  
        size++;  
    }  
    //删除队列front端的元素  
    public Node remove()  
    {  
        Node oldFront = front;  
        front = front.next;  
        oldFront.next = null;  
        size--;  
        return oldFront;  
    }  
    //访问链式队列中最后一个元素  
    public Node element()  
    {  
        return rear;  
    }  
    //判断链式队列是否为空队列  
    public boolean empty()  
    {  
        return size == 0;  
    }  
    //清空链队列  
    public void clear()  
    {  
        //将front、rear两个节点赋为null  
        front = null;  
        rear = null;  
        size = 0;  
    }  
    
}
