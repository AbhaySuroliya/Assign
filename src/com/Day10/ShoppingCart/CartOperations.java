package com.Day10.ShoppingCart;

import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.HashSet;


public class CartOperations {
	HashMap<String,CartDetails> itemMap=new HashMap<String,CartDetails>();
	   static int id=100;  
	   public void addToCart(String category , String name , int qnt , float price) {
	    	  ++id;   
		   itemMap.put(String.valueOf(id),new CartDetails(name,qnt,price,category));
	    	   System.out.println("Item added to cart successfully, id : "+id);
	     }
	     public void viewCart() {
	    	 for(Map.Entry<String,CartDetails>en:itemMap.entrySet())
	  	        {
	               System.out.println("Id : "+en.getKey()+" "+en.getValue().toString());  		 
	  	        }
	  	   }
	      public void totalBill() {
	    	  double bill=0;
	    	  for(Map.Entry<String,CartDetails>en:itemMap.entrySet())
		        {
	             System.out.println(en.getKey()+" "+en.getValue().getName()+" "+en.getValue().getQuantity()+" "+en.getValue().getPrice());
	               bill=bill+(en.getValue().getQuantity()*en.getValue().getPrice()); 
		        }
	    	  System.out.println("Total Bill: "+bill);
	      }
	      
	      public void categorywiseBill() {
	            Set<String>set=new HashSet<String>();
	            for(Map.Entry<String,CartDetails> en: itemMap.entrySet())
	         {
	            	set.add(en.getValue().getCategory());
	         }
	           for(String s : set)
	           {
	        	   double bill=0;
	        	   for(Map.Entry<String,CartDetails> en : itemMap.entrySet())
	        	   {
	        		    if(en.getValue().getCategory().equalsIgnoreCase(s))
	        		    {
	        		       bill=bill+(en.getValue().getQuantity()*en.getValue().getPrice());
	        		       System.out.println(en.getKey()+" "+en.getValue().toString());
	        		    }
	        	   }
	        	   System.out.println("Total bill of "+s+": "+bill);
	               System.out.println("\n");
	           }
	      }
	      public void removeFromCart(String id) {
	    	   itemMap.remove(id);
	     }
}
