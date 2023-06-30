package newone;

public class Agg1 {
	int age;
	Agg sd;
	public Agg1(int age,String sd)
	{
		
		this.age=age;
	
		
		
	}
	public void print()
	{
		System.out.println("Name "+sd);
		System.out.println("Age "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Agg sc=new Agg("Cijin");
		Agg1 cd=new Agg1(24,"C");
		cd.print();
		

	}

}
