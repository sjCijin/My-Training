package exception;

public class Exceparray {
	int a[]= {1,2,3};
	public void print()
	{
		try
		{
		
		System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		//catch(Exception e)
		{
		System.out.println("Error!!!");
		}
	}
	public static void main(String[] args)
	{
		Exceparray sc=new Exceparray();
		sc.print();
	}
}
