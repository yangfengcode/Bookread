package com.bookreader.model.entity;

import java.io.Serializable;
import  java.util.Date;

public class BookRecord implements Serializable {
	//�������Ƚ��ȳ��������	
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
	
	
	//����������е�ͷ�ڵ�  
    private Node front;  
    //����������е�β�ڵ�  
    private Node rear;  
    //��������������Ѱ����Ľڵ���  
    private int size;  
	
    public BookRecord()  
    {  
        //�������У�front��rear����null  
        front = null;  
        rear = null;  
    }  
    //��ָ������Ԫ�������������У���������ֻ��һ��Ԫ��  
    public BookRecord(String name,int page,int x,int y,long time)  
    {  
        front = new Node(name,page,x,y,time,null);  
        //ֻ��һ���ڵ㣬front��rear��ָ��ýڵ�  
        rear = front;  
        size++;  
    }  
    //���������еĳ���    
    public int length()  
    {  
        return size;  
    }  
    //����Ԫ�ؼ������  
    public void add(String name,int page,int x,int y,long time)  
    {  
        //����������л��ǿ�������  
        if (front == null)  
        {  
            front = new Node(name,page,x,y,time,null);  
            //ֻ��һ���ڵ㣬front��rear��ָ��ýڵ�  
            rear = front;  
        }  
        else  
        {  
            //�����½ڵ�  
            Node newNode = new Node(name,page,x,y,time,null);  
            //��β�ڵ��nextָ�������Ľڵ�  
            rear.next = newNode;  
            //���½ڵ���Ϊ�µ�β�ڵ�  
            rear = newNode;  
        }  
        size++;  
    }  
    //ɾ������front�˵�Ԫ��  
    public Node remove()  
    {  
        Node oldFront = front;  
        front = front.next;  
        oldFront.next = null;  
        size--;  
        return oldFront;  
    }  
    //������ʽ���������һ��Ԫ��  
    public Node element()  
    {  
        return rear;  
    }  
    //�ж���ʽ�����Ƿ�Ϊ�ն���  
    public boolean empty()  
    {  
        return size == 0;  
    }  
    //���������  
    public void clear()  
    {  
        //��front��rear�����ڵ㸳Ϊnull  
        front = null;  
        rear = null;  
        size = 0;  
    }  
    
}
