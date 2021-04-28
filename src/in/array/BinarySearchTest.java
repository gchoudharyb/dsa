package in.array;

public class BinarySearchTest {

	public static int findElement(int[] inputArr, int lower, int higher, int elementToSerach) {
		
		if (lower <= higher) {
			int middle = (lower + higher) / 2;
			if (elementToSerach == inputArr[middle]) {
				return middle;

			} else if (elementToSerach > inputArr[middle]) {
				lower = middle + 1;
				return findElement(inputArr, lower, higher, elementToSerach);
			} else if (elementToSerach < inputArr[middle]) {
				higher = middle - 1;
				return findElement(inputArr, lower, higher, elementToSerach);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int [] inputArr = {1,3,4,8,9,10,12,23,25,26,28,29,31,33,90,100,101};
		int high = (inputArr.length)-1;
		System.out.println(findElement(inputArr,0,high,101));
	}
}
