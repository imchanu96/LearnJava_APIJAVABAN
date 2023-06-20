
public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		섞는다라는 개념
		 */
		int[] ballArr = new int[45];
		
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
//			i번째의 배열에는 i +1의 값을 저장
		}
		int tempNum = 0;
		int randNum = 0;
		
		for (int i = 0; i < 6; i++) {
			randNum = (int)(Math.random() * 45);
//			0~44까지의 숫자를 randNum에 저장
			tempNum = ballArr[i];
//			i번째의 배열의 값은 tempNum의 값을 저장
			ballArr[i] = ballArr[randNum];
			ballArr[randNum] = tempNum;
			
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + "\t");
			
		}
	}

}
