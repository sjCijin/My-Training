package polymorphism;

public class Offseason extends Onseason{
	int discount1;
	public void dis2()
	{
		super.dis();
		discount1=(price*15)/100;
		System.out.println("DISCOUNT IN OFFSEASON: "+discount1);
	}

	public static void main(String[] args) {
		
		Offseason sc=new Offseason();
		sc.dis2();

	}

}
