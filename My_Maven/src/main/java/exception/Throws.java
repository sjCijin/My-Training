package exception;

public class Throws {
	int a = 10;

	public void hai() throws ArithmeticException {
		if (a < 18) {
			throw new ArithmeticException("NOT VALID");
		} else {
			System.out.println("VALID");
		}
	}

	public static void main(String[] args) {

		Throws sc = new Throws();
		sc.hai();

	}

}
