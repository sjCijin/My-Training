package test;

public class Employee2 extends Employee {
	String name="CIJIN";
	int age=25;
	public void emp2()
	{
		super.emp1();
		System.out.println("EMPLOYEE NAME:"+name);
		System.out.println("EMPLOYEE AGE: "+age);
	}
	public static void main(String[] args)
	{
		Employee2 sc=new Employee2();
		sc.emp2();
				
	}

}
