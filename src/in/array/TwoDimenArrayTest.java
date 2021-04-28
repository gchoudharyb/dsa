package in.array;

public class TwoDimenArrayTest {
	public static void main(String[] args) {
		int [][] twoDArray= new int [3][7];
		int num=0;
		System.out.println(twoDArray.length);
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				twoDArray[i][j] = ++num;
			}
		}
		
		System.out.println();
	}
}
