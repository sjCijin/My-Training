package empolye;
import java.util.Scanner;
public class Salary {
	double a;
	int b;
	int c;
	double hra,pf;
	public void sal()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE BASIC PAY: ");
	a=sc.nextDouble();
	Scanner cd=new Scanner(System.in);
	System.out.println("ENTER THE DEDUCTION AMOUNT: ");
	b=cd.nextInt();
	Scanner fc=new Scanner(System.in);
	System.out.println("ENTER THE BONUS: ");
	c=fc.nextInt();
}
}
