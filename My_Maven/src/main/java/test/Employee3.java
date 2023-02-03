package test;

public class Employee3 extends Employee2{
	int bonus=5000;
	public void emp3()
	{
		super.emp2();
		System.out.println("BONUS OF EMPLOYEE: "+bonus);
	}

	public static void main(String[] args) {
		Employee3 dc=new Employee3();
		dc.emp3();

	}

}
