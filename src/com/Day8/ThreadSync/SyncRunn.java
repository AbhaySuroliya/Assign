package com.Day8.ThreadSync;

public class SyncRunn implements Runnable{
	 	String arg;
	    SharedSyn obj;
	    Thread t;
	    public SyncRunn(String arg, SharedSyn obj) {
	        super();
	        this.arg = arg;
	        this.obj = obj;
	        t=new Thread(this);
	        t.start();
	    }
	    @Override
	    public void run() {
	        // TODO Auto-generated method stub
	        obj.shareMethod(arg);
	        
	    }
}
