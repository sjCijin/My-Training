package newone;

public class New2 extends Add{
	public void sub()
	{
		
		int d=a-b;
		System.out.println(d);
		System.out.println(super.a);
		
		
	}

	public static void main(String[] args) {
		
	
	
		New2 sc=new New2();
		sc.add();
		sc.sub();
		
		

	}

}
