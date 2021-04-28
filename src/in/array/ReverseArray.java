package in.array;

public class ReverseArray {

	public static int[] reverseUsingNewArray(int[] inputArr) {

		if (null == inputArr) {
			return null;
		}

		else {
			int[] resultArr = new int[inputArr.length];
			int inputArrLength = inputArr.length;

			int j = 0;
			for (int i = inputArrLength - 1; i >= 0; i--) {
				resultArr[j] = inputArr[i];
				j++;
			}

			return resultArr;
		}
	}
	public static int[] reverseUsingSameArray(int[] inputArr) {

		if (null == inputArr) {
			return null;
		}

		else {
			int inputArrLength = inputArr.length;

			int temp = 0;
			int j=0;
			for (int i = inputArrLength - 1; i >= 0; i--) {
				temp = inputArr[inputArrLength - 1];
				
				for(int k =inputArrLength - 1 ; k>j;k--)
				{
					inputArr[k] = inputArr[k-1];
				}
				inputArr[j]=temp;
				j++;
			}

			return inputArr;
		}
	}
	
	public static int[] reverseUsingSwapping(int[] inputArr) {

		if (null == inputArr) {
			return null;
		}

		else {
			int inputArrLength = inputArr.length;

			for (int i = inputArrLength - 1, j=0; j!=i; i--,j++) {
				
				int temp = inputArr[i];
				inputArr[i] = inputArr[j];
				inputArr[j] = temp;
			}

			return inputArr;
		}
	}
	
	public static void main(String[] args) {
		int[] inputArr = new int[] { 1, 2, 20, 9, 0, 5, 8, 60, 11 };

		int[] resultArr = reverseUsingSwapping(inputArr);

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
