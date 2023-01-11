package Exercise_01;

import java.util.Scanner;

public class exercise_ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name;
       String reverse = "";
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the name :");
       name = scan.nextLine();
		int length = name.length();
		 
	      for ( int i = length - 1; i >= 0; i-- ) 
	         reverse = reverse + name.charAt(i);
	 
	      if (name.equals(reverse))
	          System.out.println(name+" is a palindrome");
	       else
	          System.out.println(name+" is not a palindrome");
	  
		

	}
	}

	
	
