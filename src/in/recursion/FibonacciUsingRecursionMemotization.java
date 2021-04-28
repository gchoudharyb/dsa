package in.recursion;

public class FibonacciUsingRecursionMemotization {

	static  int k = 0;
	public static int funArr[]= new int[k];
	{
		for (int i = 0; i < k; i++) {
			funArr[i]=-1;
		}
	}
	
	public static  Integer calculateFib(int n)
	{
		k=n;
		if(n<=0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			if(funArr[n]!=-1)
			{
				return funArr[n];
			}
			else
			{
				return calculateFib(n-1)+calculateFib(n-2);
			}
			
		}
	}
	
public static void main(String[] args) {
	System.out.println(calculateFib(5));
}
}
