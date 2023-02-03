package aggrigation;

public class Aggri2 {
	String adress="ROSE VILLA";
	int housenumber=34567;
	public void add()
	{
	Aggri1 sc;
	System.out.println(adress);
	System.out.println(housenumber);
	}

	public static void main(String[] args) {
		Aggri1 ed=new Aggri1();
		Aggri2 cd=new Aggri2();
		ed.details();
		cd.add();
				
	}

}
