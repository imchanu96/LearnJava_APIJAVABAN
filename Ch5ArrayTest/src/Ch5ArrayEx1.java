
public class Ch5ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 배열 길이가 10개인 배열을 만든다. 배열 안에는 순차적으로 10 20 30...100이라는 숫자를 저장한다.
		 * 
		 * 이들의 값을 순차적으로 출력하시오
		 * 
		 * 
		 * 출력 형태 10 20 30 ... 100
		 */
		int i = 0;
		int scoreArray[] = new int[10];
		
		scoreArray[0] = 10;
		scoreArray[1] = 20;
		scoreArray[2] = 30;
		scoreArray[3] = 40;
		scoreArray[4] = 50;
		scoreArray[5] = 60;
		scoreArray[6] = 70;
		scoreArray[7] = 80;
		scoreArray[8] = 90;
		scoreArray[9] = 100;

		while (i <= 9) {
			
			System.out.println(scoreArray[i]);
			i++;
			
//			int numArr[] = new int[4];
//
//			for (int i = 0; i < 4; i++) {
//				numArr[i] = (i+1) * 10;
//				System.out.println(numArr[i]);
		}

	}

}
