package test;

public class Methods {
	static String name;
	int id;
	double c;
	public  void meth(String name)
	{
		System.out.println("Name of Student: "+name);
	}
	public  void meth(int id)
	{
		System.out.println("Employee id; "+id);
		
	}
	public  void meth(double c)
	{
		
		System.out.println("Car licence no: "+c);
		
	}
	public static void main(String[] args)
	{
		Methods sc=new Methods();
		sc.meth("CIJIN");
		sc.meth(12345);
		sc.meth(4567f);
	}
	

}
