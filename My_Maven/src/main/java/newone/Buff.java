package newone;

public class Buff {

	public static void main(String[] args) {
		StringBuffer sc=new StringBuffer("Hello");
		sc.append(true);
		System.out.println(sc);
		sc.delete(1, 5);
		System.out.println(sc);
		sc.reverse();
		System.out.println(sc);
		sc.replace(1,3,"H");
		System.out.println(sc);
		sc.insert(1, 3);
		System.out.println(sc);
	}

}
