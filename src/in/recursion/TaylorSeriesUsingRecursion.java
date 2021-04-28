package in.recursion;

public class TaylorSeriesUsingRecursion {

	static double result;
	static double f = 1;
	static double p = 1;
	public static double calculateTaylorSeries(int x , int n)
	{
		if (n==0)
		{
			return 1;
		}
		else
		{
			result = calculateTaylorSeries(x,n-1);
			p=p*x;
			f=f*n;
			return result+p/f;
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calculateTaylorSeries(1, 10));
	}
}
