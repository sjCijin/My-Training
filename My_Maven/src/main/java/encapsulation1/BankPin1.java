package encapsulation1;

import java.util.Scanner;

public class BankPin1{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE PIN");
		int a=sc.nextInt();
		BankPin obj=new BankPin();
		obj.setPin(a);
		obj.code();
}
}
