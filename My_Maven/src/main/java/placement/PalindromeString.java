package placement;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	
				
				 String name,rev = "";
			      Scanner sc = new Scanner(System.in);
			 
			      System.out.println("Enter a string:");
			      name = sc.nextLine();
			 
			      int length = name.length();
			 
			      for ( int i = length - 1; i >= 0; i-- )
			         rev = rev + name.charAt(i);
			 
			      if (name.equals(rev))
			         System.out.println(name+" is a palindrome");
			      else
			         System.out.println(name+" is not a palindrome");
			}

	}


