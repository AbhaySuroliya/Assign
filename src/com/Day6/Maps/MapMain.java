package com.Day6.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<Integer,MapStudent>studmap=new HashMap<Integer,MapStudent>();
        studmap.put(1001,new MapStudent("Vinay",201,"cs"));
        studmap.put(1002,new MapStudent("Raj",202,"cs"));
        studmap.put(1003,new MapStudent("Sam",203,"cs"));
        studmap.put(1004,new MapStudent("Binit",204,"cs"));
        studmap.put(1005,new MapStudent("Reena",205,"cs"));
        for(int n : studmap.keySet())
        {
       	 if(studmap.get(n).getName().substring(0,1).equalsIgnoreCase("S"))
       	 {
       		 System.out.println(studmap.get(n).toString());
       	 }
        }
	}

}
