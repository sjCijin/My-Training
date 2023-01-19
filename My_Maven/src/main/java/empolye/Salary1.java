package empolye;

public class Salary1 extends Salary {
	public void hraa()
	{
		hra=super.a*0.05;
		System.out.println("HRA: "+hra);
	}

	public void pfa() {
		pf=super.a*0.2;
		System.out.println("PF FUND: "+pf);
	}

}
