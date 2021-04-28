package in.recursion;

public class FibonacciUsingRecursion {
public static void main(String[] args) {
	System.out.println(fibonacciUsingRecursion(5));
}

//input = position for which you want to get fib

public static int fibonacciUsingRecursion(int input)
{
	if(input<0)
	{
		System.out.println("Invalid input");
		return input;
	}
	else if (input==1 || input==2)
	{
		return (input-1);
	}
	else
	{
		return fibonacciUsingRecursion(input-1)+ fibonacciUsingRecursion(input-2);
	}
	
}
}
