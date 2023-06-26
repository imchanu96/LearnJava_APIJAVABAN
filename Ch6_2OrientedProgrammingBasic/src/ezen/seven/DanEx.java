package ezen.seven;

public class DanEx {
	
	
	void dan(int a, int b) {
		int[][] arr = new int[a][b];
		for (int i = 2; i < arr.length; i++) {
			for (int j = 1 ; j < arr.length; j++) {
				arr[i][j] = i*j;
						
				System.out.print(i + "*" + j 
						+ "=" + arr[i][j] + "\t");
			}
			System.out.println("");
		}
		

	}
}
