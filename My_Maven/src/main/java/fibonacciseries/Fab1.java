package fibonacciseries;
import java.util.Scanner;
public class Fab1 {
	
	
	public static void main(String args[])
	{
		int num1=0,num2=1,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count");
		int count=sc.nextInt();
		System.out.println("---------------------------");
		System.out.print(num1+" "+num2);
		for(int i = 2;i<count;i++)
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
			}
		}
	}
