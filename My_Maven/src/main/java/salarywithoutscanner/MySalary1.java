package salarywithoutscanner;

public class MySalary1 extends MySalary {
	public void hraa()
	{
		hra=super.basic*0.05;
		System.out.println("HRA: "+hra);
	}
	public void pfa()
		{
		pf=super.basic*0.2;
		System.out.println("PF Fund: "+pf);
		
	}

}
