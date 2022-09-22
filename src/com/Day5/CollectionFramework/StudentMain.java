package com.Day5.CollectionFramework;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	public static void show(ArrayList<SearchWithCollege>list,String sen)
	{
		list.stream().filter(str->str.getColgName().equalsIgnoreCase(sen)).forEach(System.out::println);
	}

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<SearchWithCollege> list= new ArrayList<SearchWithCollege>();
		list.add(new SearchWithCollege("Dave",121,"Bits"));
		list.add(new SearchWithCollege("Meena",122,"IIT"));
		list.add(new SearchWithCollege("Raj",123,"VIT"));
		list.add(new SearchWithCollege("Mike",124,"Bits"));
		list.add(new SearchWithCollege("Sheldon",125,"VIT"));
		list.add(new SearchWithCollege("Shruti",126,"IIT"));
		list.add(new SearchWithCollege("Aman",127,"VIT"));
		
		System.out.println("Enter college name to search");
		String sen=scan.nextLine();
		
		show(list,sen);
		
	}
	
	

}
