package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBERS");
		int num=sc.nextInt();
		StringBuffer cd=new StringBuffer(String.valueOf(num));
		StringBuffer rev=cd.reverse();
		System.out.println("REVERSE NUM : "+rev);
	}
}
