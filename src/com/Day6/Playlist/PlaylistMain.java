package com.Day6.Playlist;

import java.util.Scanner;

public class PlaylistMain {

	public static void main(String[] args) {
		SongStructure obj=new SongStructure(5);
		Scanner scan=new Scanner(System.in);
    	
	try{
    	while(true)
    	{
			System.out.println("1.Add Song");
			System.out.println("2.Play Song");
			System.out.println("3.Song remaining");
			System.out.println("4.remove Song");
			System.out.println("5.Exit");
			
		    int x=scan.nextInt();
		    if(x==1)
		    {
		    	System.out.println("Enter Song name");
		    	String name=scan.next();
		    	obj.enqueue(name);
		    }
		    else if(x==2)
		    {
		    	System.out.println(obj.front()+" is Playing");
		    }
		    else if(x==3)
		    {
		    	System.out.println(obj.count()+" song(s) remaining");
		    }
		    else if(x==4)
		    {
		    	System.out.println("2.Delete a Song");
		    	{
		    		obj.dequeue();
		    	}
		    }
		    else
		    	break;
    	   }
	}
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	}

}
