package in.recursion;

public class FactorialUsingRecursion2 {
	
	public static Integer findFib(Integer num)
	{
		if(num==0)
		{
			return 1;
		}
		else if(num<0)
		{
			return -1;
		}
		else
		{
			return (findFib(num-1))*num;
		}
	}
	
	public static Integer finFibUsingLoop(Integer num)
	{
		int result=num;
		if(num==0)
		{
			return 1;
		}
		else if(num<0)
		{
			return -1;
		}
		else
		{
			while (num!=1) {
				result = result*(num-1);
				num--;
				
			}
			return result;
		}
	}
public static void main(String[] args) {
	System.out.println(findFib(3));
	System.out.println(finFibUsingLoop(3));
}
}
