package in.array;

public class ThreeDimArray {

	public static void main(String[] args) {
		int [][][] threeDArray= new int [3][2][3];
		int num=0;
		System.out.println(threeDArray.length);
		for (int i = 0; i < threeDArray.length; i++) {
			for (int j = 0; j < threeDArray[i].length; j++) {
				for (int k = 0; k < threeDArray[i][j].length; k++) {
					threeDArray[i][j][k] = ++num;
				}

			}
		}
		
		System.out.println();
	}

}
