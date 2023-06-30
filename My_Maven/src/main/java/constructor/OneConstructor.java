package constructor;

public class OneConstructor {
	int a,b,c;
	OneConstructor(int x,int y)
	{
		a=x;
		b=y;
		c=x+y;
		System.out.println(c);

	}
public static void main(String[] args) {
		
		OneConstructor obj=new OneConstructor(30,40);
		
				
	}

}

