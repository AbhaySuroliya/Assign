package com.Day10.Java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class TestLambda {

	public static void main(String[] args) {
		ArrayList<LambdaStud> list=new ArrayList<LambdaStud>();
		list.add(new LambdaStud("Veeni",22));
		list.add(new LambdaStud("Ram",42));
		list.add(new LambdaStud("Karan",12));
		list.add(new LambdaStud("Lil",10));
		Collections.sort(list,(s1,s2)->s2.getAge()-s1.getAge());
		for(LambdaStud i : list)
		System.out.println(i);

	}

}
