package in.recursion;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		System.out.println(factorialUsingRecursion(2));
	}

	public static int factorialUsingRecursion(int input) {
		if (input == 0 || input == 1) {
			return 1;
		} else {
			return input * factorialUsingRecursion(input - 1);
		}

	}
}