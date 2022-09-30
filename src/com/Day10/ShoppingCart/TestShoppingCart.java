package com.Day10.ShoppingCart;
import java.util.*;

public class TestShoppingCart {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CartOperations opera=new CartOperations();
		 try {
			 while(true) {
			 System.out.println("1.Add Item to cart");
			 System.out.println("2.View cart Items");
			 System.out.println("3.View Total bill");
			 System.out.println("4.View category-wise bill");
			 System.out.println("5.Remove Item from cart");
			 System.out.println("6.Exit");
			  int i=scan.nextInt();
			  if(i==1)
			  {
				 System.out.println("Enter item name");
				 String name=scan.next();
				 System.out.println("Enter item category");
				 String cat=scan.next();
				 System.out.println("Enter quantity");
				 int qu=scan.nextInt();
				 System.out.println("Enter price");
				 float p=scan.nextFloat();
				 opera.addToCart(cat, name, qu, p);
			  }
			  else if(i==2)
			  {
				  opera.viewCart();
			  }
			  else if(i==3)
			  {
				opera.totalBill();  
			  }
			  else if(i==4)
			  {
				  opera.categorywiseBill();
			  }
			  else if(i==5)
			  {
				  opera.viewCart();
				  System.out.println("Enter Item id");
				  String id=scan.next();
				  opera.removeFromCart(id);
			  }
			  else
			  {
				  break;
			  }
		     }
			 System.out.println("Thank you!!");
		 } 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}

}
