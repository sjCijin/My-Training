package newone;

public class Method2 {
	static int sum;
	public static void add(int a,int b)
	{
		sum=a+b;
		
		System.out.println("SUM OF 2 NUMBERS ="+sum);
		avg();
	}
	public static void avg()
	{
		
		int avg=sum/2;
		System.out.println(avg);
	}
	

	public static void main(String[] args) {
		Method2.add(60,40);
		

	}

}
