package encapsulation1;

public class BankPin {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void code()
	{
		switch(pin)
		{
		case 1001:
			System.out.println("Valid PIN");
			break;
		case 1234:
			System.out.println("Valid PIN");
			break;
		case 1212:
			System.out.println("Valid PIN");
			break;
		default:
			System.out.println("Enter The Valid PIN");
		}
	}
}
