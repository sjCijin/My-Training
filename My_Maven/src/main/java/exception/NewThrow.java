package exception;

public class NewThrow {
	int age=13;
	public void check() {
		if(age<18)
		{
		throw new ArithmeticException("not valid");
		
	}
		else
		{
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) {
		NewThrow sc=new NewThrow();
		sc.check();


	}

}
