package in.recursion;

public class TreeRecursion {

	static void funTest(int n)
	{
		if(n>0)
		{
			System.out.println(n);
			funTest(n-1);
			funTest(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		funTest(3);
	}
	
}
