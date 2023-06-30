package swap;

public class Swaping {

	public static void main(String[] args) {
		int a=10,b=30;
			//	int t=0;
		System.out.println("Before swaping : "+a+" "+b);
		System.out.println("-----------------------------");
		//first method useing a temp varible t
		 /*t=a;
		 a=b;
		 b=t;*/
		//Second method using arthematic symbols
		a=a+b;
		b=a-b;
		a=a-b;
		 System.out.println("After swaping : "+a+" "+b);		 

	}

}
