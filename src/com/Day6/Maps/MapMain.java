package com.Day6.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<Integer,MapStudent>studmap=new HashMap<Integer,MapStudent>();
        studmap.put(1001,new MapStudent("Dev",1001,"IT"));
        studmap.put(1002,new MapStudent("Suraj",1002,"IT"));
        studmap.put(1003,new MapStudent("Shayam",1003,"IT"));
        studmap.put(1004,new MapStudent("ABC",1004,"IT"));
        studmap.put(1005,new MapStudent("Ram",1005,"IT"));
        for(int n : studmap.keySet())
        {
       	 if(studmap.get(n).getName().substring(0,1).equalsIgnoreCase("S"))
       	 {
       		 System.out.println(studmap.get(n).toString());
       	 }
        }
	}

}
