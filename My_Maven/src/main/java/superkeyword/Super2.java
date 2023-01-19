package superkeyword;

public class Super2 extends Super1  {
	public void sub() {
		int a=90;
		float b=8.67f;
		float c=a-b;
		System.out.println("Substract: "+c);
		System.out.println("Parent class SUM: "+super.c);
		//For super method
		super.add();
	}
	
	public static void main(String[] args) {
		Super2 sc=new Super2();
		Super1 cd=new Super1();
		
		cd.add();
		sc.sub();
	}

}
