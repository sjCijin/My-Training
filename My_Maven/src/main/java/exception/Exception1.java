package exception;

public class Exception1 {
	int a=10;
	
	

	public void print()
	{
		//try and catch are used to handle exception
		try
		{
		int b=a/0;
		}
		catch(Exception e)
		{
			System.out.println("It is Not Divisible By Zero: ");
		}
	finally {
		System.out.println("finally");
	}
	}
		
	public static void main(String[] args) {
		Exception1 sc=new Exception1();
		sc.print();
		

	}

}
	
