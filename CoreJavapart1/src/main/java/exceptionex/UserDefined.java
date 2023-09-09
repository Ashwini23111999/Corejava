package exceptionex;

public class UserDefined {
	static void validAge (int age) {
		if (age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {
		validAge(23);
	}

}
