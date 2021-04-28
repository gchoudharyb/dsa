package in.recursion;

public class ExampleOne {
	public static void main(String[] args) {
		System.out.println("MAIN" + foo(3) + "");

		Integer[] arr = { 1, 2, 3, 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].hashCode());
		}
	}

	private static int foo(int i) {
		if (i < 0) {
			return i;
		} else {
			foo(i - 1);
		}
		System.out.print("foo" + i);
		return i;
	}
}
