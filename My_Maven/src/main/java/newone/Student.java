package newone;

public class Student {
	static String collage="OBSQURA";
	String name;
	int age;
	
	
	public Student(String b,int c)
	{
		this();
		this.name=b;
		this.age=c;
				
	}
	public Student()
	{
		System.out.println("Hello");
	}
	public void just()
	{
		System.out.println("Hai");
		
	}
	public void print()
	{
		
		this.just();
		System.out.println(collage);
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		Student sc=new Student("CIJIN",25);
		//Student cd=new Student("VIJAY",25)
		//cd.print();
		sc.print();
		
		
	
	}

}
