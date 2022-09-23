package com.Day6.eLearning;

import java.util.Comparator;

public class Sorting implements Comparator<StudentDetails> {
	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.getId()-o2.getId();
	}

}
