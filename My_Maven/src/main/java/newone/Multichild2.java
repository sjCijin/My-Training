package newone;

public class Multichild2 extends Multichild1{
	public void nextChild2()
	{
		System.out.println("Multi Child 2");
	}

	public static void main(String[] args) {
		Multichild2 sc=new Multichild2();
		sc.multiParent();
		sc.nextChild();
		sc.nextChild2();
		

	}

}
