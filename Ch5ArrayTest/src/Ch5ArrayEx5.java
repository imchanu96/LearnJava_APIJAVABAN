
public class Ch5ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		2차원 배열을 공부해보자
		
		10 10 10 10 10
		20 20 20 20 20
		30 30 30 30 30
		40 40 40 40 40
		
		 */
		// 기왕이면 입력
		int[][] numArr = new int[4][5];
		// 입력단
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[0].length; j++) {
				numArr[i][j] = (i*10) + 10;
			}
		}
		// 출력단
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[0].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
