package in.array;

import java.util.Arrays;

public class FindMaxInAnArray {
	
	public static int findMaxUsingSort(int [] inputArr)
	{
		int result = 0;
		
		if(null==inputArr)
		return result;
		
		
		int arrLen = inputArr.length;
		if(arrLen==1)
		{
			return inputArr[0];
		}
		else
		{
			Arrays.sort(inputArr);
			return inputArr[arrLen-1];
		}	
	}
	
	public static int findMaxUsingLoop(int [] inputArr)
	{
		int result = 0;
		
		if(null==inputArr)
		return result;
		
		
		int arrLen = inputArr.length;
		if(arrLen==1)
		{
			return inputArr[0];
		}
		else
		{
			result = inputArr[0];
			for (int i = 1; i < arrLen ; i++) {
				
				if(inputArr[i]>result)
				{
					result = inputArr[i];
				}
				else
				{
					continue;
				}
			}
			return result;
		}	
	}
	
	public static void main(String[] args) {
		
		int [] inputArr= new int [] {1,2,20,9,0,5,8,60,11};
		
		System.out.println(findMaxUsingSort(inputArr));
		System.out.println(findMaxUsingLoop(inputArr));
		
		System.out.println(9/2);
	}
}
