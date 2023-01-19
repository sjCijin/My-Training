package empolye;

public class Salary2 extends Salary1{
	public static void main(String[] args)
	{
		Salary1 obj=new Salary1();
		obj.sal();
		obj.hraa();
		obj.pfa();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Basic Pay: "+obj.a+" "+"Deduction Amount: "+obj.b+" "+"Bonus: "+obj.c);
		System.out.println("HRA: "+obj.hra);
		System.out.println("PF Amount: "+obj.pf);
		double total=obj.a+obj.hra-obj.pf-obj.b+obj.c;
		System.out.println("Total Amount in Hand:"+total);
	}

}







