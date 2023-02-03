package array;

public class Findx {

	public static void main(String[] args) {
		int marks;
		int name[]=new int[3];
		name[0]=45;
		name[1]=95;
		name[2]=67;
		marks=name[0]+name[1]+name[2];
			
		System.out.println("Physics: "+name[0]);
		System.out.println("Chemistry: "+name[1]);
		System.out.println("Maths: "+name[2]);
		if(marks>50)
		{
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
