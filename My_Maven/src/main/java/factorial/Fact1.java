package factorial;

import java.util.Scanner;
public class Fact1 {
	public void factorial()
	{
		int num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num=sc.nextInt();
	
		for(int i=1;i<=num;i++)
		{
		fact=fact*i;

	}
		System.out.println("Factorial of "+num+" is : "+fact);
	}

		public static void main(String[] args) {
		Fact1 obj=new Fact1();
		obj.factorial();
	}

}
