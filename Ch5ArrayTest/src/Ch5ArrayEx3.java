
public class Ch5ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 최대값과 최소값 구하기
		 * 
		 * 79, 88, 91, 33이라는 숫자가 존재한다.
		 * 
		 * 이들 중에 최대값, 최소값을 구하라.
		 * 
		 */

		int[] numArr = new int[4];
		
		

		numArr[0] = 79;
		numArr[1] = 91;
		numArr[2] = 88;
		numArr[3] = 100;
		
		int min = numArr[0];
		int max = 0;
		for (int i = 0; i < 4; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}
		
		
			if (min > numArr[i]) {
				min = numArr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
