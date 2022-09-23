package com.Day6.eLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;

public class DeclareArray {
	ArrayList<StudentDetails>list1=new ArrayList<StudentDetails>();
    ArrayList<CourseDetails>list2=new ArrayList<CourseDetails>();
    ArrayList<OtherDetails> enroll=new ArrayList<OtherDetails>();
    public void addCourse(int id,String name,String des)
    {
    	list2.add(new CourseDetails(name,id,des));
    }
	public void addStudent(String name, int id,String dep) {
		list1.add(new StudentDetails(name,id,dep));
	}
	public void displayCourse() {
		 for(int i=0;i<list2.size();i++)
		 {
			 System.out.println(list2.get(i).toString());
		 }
	}
	public void enrolls(int id, int cid) {
		enroll.add(new OtherDetails(id,cid));
		
	}
	public void displayCourse(int id) {
		ArrayList<StudentDetails> s=new ArrayList<StudentDetails>();
		for(int i=0;i<enroll.size();i++)
		{
			if(enroll.get(i).getCId()==id)
			{
				for(int j=0;j<list1.size();j++)
				{
					if(enroll.get(i).getStuId()==list1.get(j).getId())
					{
						s.add(list1.get(i));
					}
				}
			}
		}
	       Collections.sort(s,new Sorting());
	       for(int i=0;i<s.size();i++)
	       {
	    	   System.out.println(s.get(i).toString());
	       }
	}
}
