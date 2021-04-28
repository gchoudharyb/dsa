package in.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayPairOfSum {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(6);
		integers.add(7);
		integers.add(8);
		integers.add(9);
		integers.add(10);
		integers.add(11);
		integers.add(12);
		integers.add(13);
		printPairs(integers, 14);
	}
	
	public static void printPairs(List<Integer> list,int sum)
	{
		int listSize = list.size();
		
		for (int i = 0; i < listSize; i++) {
			
			
			for (int j = i+1; j < listSize; j++) {
				int sumNum = list.get(i)+list.get(j);
				
				if(sum==sumNum) 
				{
					System.out.println("{"+list.get(i)+","+list.get(j)+"}");
					continue;
				}
			}
		}
	}
}
