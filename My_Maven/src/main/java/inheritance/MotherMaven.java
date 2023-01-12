package inheritance;

public class MotherMaven extends MavenInheritance{
	public void print2()
	{
		System.out.println("MOTHER");
	}
	public static void main(String[] args)
	{
		MotherMaven sc=new MotherMaven();
		sc.print();
		sc.print2();
	}

}
