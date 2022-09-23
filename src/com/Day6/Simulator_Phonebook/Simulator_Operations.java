package com.Day6.Simulator_Phonebook;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simulator_Operations {
	ArrayList<Phonebook> list=new ArrayList<Phonebook>();
	public boolean validate(String con) {
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(con);
		return (m.find()&&m.group().equals(con));	
	}

	public void displayContact() {
		   for(int i=0;i<list.size();i++)
			   System.out.println(list.get(i).toString());
		}
	public void addContact(String s, String con) {
		list.add(new Phonebook(s,con));
	}

	public void searchByName(String s) {
		list.stream().filter(p->p.getName().equalsIgnoreCase(s)).forEach(System.out::println);
	}
	public void searchByContact(String s) {
		list.stream().filter(p->p.getContact().equalsIgnoreCase(s)).forEach(System.out::println);
	}

	public void delete(String con) {
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getContact().equals(con))
			{
				list.remove(i);
				break;
			}
		}
	}
}
