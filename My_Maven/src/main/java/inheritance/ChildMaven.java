package inheritance;

public class ChildMaven extends MotherMaven{
	public void print3()
	{
		System.out.println("CHILD");
	}

	public static void main(String[] args) {
		ChildMaven sc=new ChildMaven();
		sc.print();
		sc.print2();
		sc.print3();
	}
		// TODO Auto-generated method stub

	}