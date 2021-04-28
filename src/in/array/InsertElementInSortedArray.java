package in.array;

public class InsertElementInSortedArray {

	public static void insert(int[] inputArr, int element) {
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i]>element)
			{
				for (int j = inputArr.length-1; j >= i ; j--) {
					inputArr[j] = inputArr[j-1];
				}
				inputArr[i]=element;
				break;
			}
		}
	}
	public static void insert1(int[] inputArr, int element) {
		for (int i = inputArr.length-1; i < 0; i--) {
			if( inputArr[i]>element)
			{
				inputArr[i+1] = inputArr[i];
			}
			else
			{
				inputArr[i+1] = element;
			}
		}
	}
	public static void main(String[] args) {
		int[] inputArr = new int[] { 1, 2, 20, 91, 100, 151, 180, 260, 311,0 };

		insert1(inputArr,10);

		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
	}
}
