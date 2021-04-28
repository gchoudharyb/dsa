package in.recursion;

public class PowerUsingRecursion {

	public static Integer calculatePow(int num, int pow) {
		if (num == 0) {
			return 0;
		} else if (pow == 0 && num > 0) {
			return 1;
		} else {
			pow = pow - 1;
			return calculatePow(num, pow) * num;
		}
	}

	public static void main(String[] args) {
		System.out.println(calculatePow(2, 4));
	}
}