package com.Day10.Java8.Stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

import com.Day10.Java8.Lambda.LambdaStud;
import com.Day5.CollectionFramework.SearchWithCollege;

public class TestStream {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<StreamStud> list= new ArrayList<StreamStud>();
		list.add(new StreamStud("Abhi",121,"Bits"));
		list.add(new StreamStud("Ajay",122,"IIT"));
		list.add(new StreamStud("Raj",123,"VIT"));
		list.add(new StreamStud("Mike",124,"Bits"));
		list.add(new StreamStud("Akku",125,"VIT"));
		list.add(new StreamStud("Shruti",126,"IIT"));
		list.add(new StreamStud("Aman",127,"VIT"));
		
		ArrayList<StreamStud> list1= new ArrayList<StreamStud>();
		list1=(ArrayList<StreamStud>)list.stream().filter(str->str.getName().substring(0,1).equals("A")).collect(Collectors.toList());
		
		Collections.sort(list1,(str1,str2)->str1.getName().compareTo(str2.getName()));
		for(StreamStud i : list1)
			System.out.println(i);
	}
	
	

}