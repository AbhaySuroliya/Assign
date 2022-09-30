package com.Day8.WithandWithoutSync;

public class Test {

	public static void main(String[] args) {
		WithandWithout sy=new WithandWithout(2000);
    	WithoutSync wos=new WithoutSync(sy);
    	Sync ws=new Sync(sy);
      	//ws.setPriority(9);
    	wos.start();
    	//ws.setPriority(8);
    	ws.start();
  
	}

}
