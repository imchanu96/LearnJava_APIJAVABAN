
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 10, 20, 30
		 40, 50, 60
		 70, 80, 90
		 100, 110, 120
		*/

		
		int[][] numArr = new int[4][3];
		int num = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[0].length; j++) {
				num = num +10;
				numArr[i][j] = num;
				System.out.print(numArr[i][j] + " ");
			}
		System.out.println("");
		}	
	}
}
