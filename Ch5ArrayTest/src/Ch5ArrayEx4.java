
public class Ch5ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1~5의 숫자를 배열에 입력한다
		이들을 내림차순으로 정렬한다
		순차적으로 출력한다
		
		출력형태
		5
		4
		3
		2
		1
		 */
		int tempNum = 0;
		int[] numArr = new int [5];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
//		numArr[i]인덱스에 i+1값을 저장
		}
		
		for (int i = 4; i >= 0; i--) {
			if (tempNum < numArr[i]) {
				tempNum = numArr[i];
//				tempNum이라는 변수가 numArr[i]보다 작다면
//				tempNum이라는 변수에 numArr의 값을 저장
			}
			System.out.println(numArr[i]);
		}
		
	}

}
