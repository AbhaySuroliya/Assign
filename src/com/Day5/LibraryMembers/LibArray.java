package com.Day5.LibraryMembers;

import java.util.ArrayList;

public class LibArray {
	 ArrayList<LibData>list=new ArrayList<LibData>();
	    public void add(String s,String id,String a)
	    {
	    	list.add(new LibData(s,id,a));
	    }
	    public void display() {
	    	for(int i=0;i<list.size();i++)
	    	{
	    		System.out.println(list.get(i).toString());
	    	}
	    }
	    public void address(String s)
	    {
	    	list.stream().filter(str->str.getAddress().equalsIgnoreCase(s)).forEach(System.out::println);
	    }
}
