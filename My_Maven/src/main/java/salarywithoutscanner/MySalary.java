package salarywithoutscanner;

public class MySalary {
	double basic;
	int reduction;
	int bonus;
	double hra,pf;
	public void sal()
	{
		basic=45000;
		reduction=3000;
		bonus=5000;
		System.out.println("Basic Pay: "+basic);
		System.out.println("Reduction Amount: "+reduction);
		System.out.println("Bonus Amount: "+bonus);
	}

}
