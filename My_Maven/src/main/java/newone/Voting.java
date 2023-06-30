package newone;

public class Voting {
	public static boolean old(int age)
	{
		if(age>=18)
		{
			System.out.println("YOU ARE ELIGIBLE");
			return true;
		}
		else {
			System.out.println("YOU ARE NOT ELIGIBLE");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean ed=Voting.old(17);
System.out.println(ed);

	}

}
