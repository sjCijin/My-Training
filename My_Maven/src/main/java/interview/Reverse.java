package interview;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		StringBuffer cd=new StringBuffer(String.valueOf(num));
		StringBuffer rev=cd.reverse();
		System.out.println("-----------------");
		System.out.println("Reverse num is: "+rev);
		
	}

}
