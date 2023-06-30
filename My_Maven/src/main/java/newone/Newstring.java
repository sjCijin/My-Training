package newone;

public class Newstring {

	public static void main(String[] args) {
		
		String s="Hai";
		String sc=new String("Hai");
				System.out.println(s);
				System.out.println(sc);
				System.out.println(s.length());
				System.out.println(s.equals(sc));
				System.out.println(s.charAt(1));
				System.out.println("Is s is empty"+s.isEmpty());
				System.out.println("Is s is ignorecase"+s.equalsIgnoreCase(sc));
	}

}
