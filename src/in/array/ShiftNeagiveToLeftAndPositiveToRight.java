package in.array;

public class ShiftNeagiveToLeftAndPositiveToRight {

	public static void shift(int[] inputArr) {

		int i = 0;
		int j = (inputArr.length)-1;
		
		
		while(i<j)
		{
			while (inputArr[i]<0) {
				i++;
				
			}
			while (inputArr[j]>=0) {
				j--;
				
			}
			if(i<j)
			{
				int temp = inputArr[i];
				inputArr[i] = inputArr[j];
				inputArr[j] = temp;
			}
		}
		

	}

	public static void main(String[] args) {
		int[] inputArr = new int[] { -1, 2, -20, 91, 100, -151, -180, 260, -311,0 };

		shift(inputArr);

		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
	}
}
