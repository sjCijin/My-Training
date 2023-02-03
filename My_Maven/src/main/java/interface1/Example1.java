package interface1;

public class Example1 implements Example,NextExample {

	public void add() {
		System.out.println(a+b);
	
	}
	public static void main(String[] args)
	{
		Example1 sc=new Example1();
		sc.add();
		sc.main();
	}
	public void main() 
	{
	  System.out.println("Hello");
		
	}

}
