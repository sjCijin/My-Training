package array;


import java.util.Scanner;
public class RevArray {
	public static void main(String[] args)
	{
		int n,i,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array Values");
		n=sc.nextInt();
		int arra[]=new int[n];
		int rev[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
		arra[i]=sc.nextInt()	;
		}
		System.out.println("Reverse of Array is: ");
		for(i=n;i>0;i--,j++)
		{
			rev[j]=arra[i-1];
			System.out.println(rev[j]);
		}
	}

}
