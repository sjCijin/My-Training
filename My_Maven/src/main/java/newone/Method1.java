package newone;

public class Method1 {
	
	static int a;
	static int b;
	static int c;
	public static void add(int x,int y)
	
	{
		a=x;
		b=y;
		c=a+b;
	}
	public void print()
	{
	System.out.println(c);
	}

	public static void main(String[] args) {
		
		Method1 ob=new Method1();
		Method1.add(10, 20);
		ob.print();
		
		
		
	}

}
