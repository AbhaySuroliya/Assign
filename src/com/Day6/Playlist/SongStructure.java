package com.Day6.Playlist;

public class SongStructure {
	private int size,c,before,after;
	private String str[];
    public SongStructure(int size)
    {
    	this.size=size;
    	this.after=0;
    	this.c=0;
    	this.before=-1;
    	this.str=new String[this.size];
    }   
    public void dequeue()
    {
    	if(this.c==0)
    	{
    		System.out.println("Queue Empty!!");
    		return;
    	}
    	else
    	{
    		String song=str[after];
    		after=(after+1)%size;
    		c--;
    		System.out.println(song+" deleted");
    	}
    }
    public void enqueue(String s)
    {
    	if(this.c==size)
    	{
    		System.out.println("Queue Full!!");
    		return ;
    	}
    	// 1 2 3 
    	else {
    		before=(before+1)%size;
    		str[before]=s;
    		c++;
    		System.out.println(s+" added");
    	}
    }
    public int count()
    {
    	return c;
    } 
    public String rear() {
    	return str[before];
    }
    public String front() {
    	return str[after];
    }

}
