package salarywithoutscanner;

public class MySalary2 extends MySalary1 {

	public static void main(String[] args) {
		MySalary1 obj=new MySalary1();
		obj.sal();
		obj.hraa();
		obj.pfa();
		System.out.println("----------------------------------");
		double d=obj.basic-obj.hra-obj.pf-obj.reduction+obj.bonus;
		System.out.println("SALARY IN HAND: "+d);

	}

}
