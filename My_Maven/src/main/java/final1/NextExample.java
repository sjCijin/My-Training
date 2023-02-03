package final1;

public final class NextExample {
	//final class can only acces in one class
	final int a=30;
	final int b=40;
	final int c=a+b;
	
	public final  void add()
	{
		System.out.println(c);
	}
	public static void main(String args[])
			{
		NextExample sc=new NextExample();
		sc.add();
			}

}
