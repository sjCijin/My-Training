package test;

public class Next {
	private int amount;
	private int accno;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void acc()
	{
		System.out.println("ACCOUNT NUMBER: "+accno);
		System.out.println("Deposite Amount: "+accno);
	}

}
