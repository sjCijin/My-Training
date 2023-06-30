package newone;

public class Child1 extends Parent{
	public void child1()
	{
		System.out.println("Sigle Inheritance");
	}

	public static void main(String[] args) {
		
		Child1 sc=new Child1();
		sc.print1();
		sc.child1();

	}

}
