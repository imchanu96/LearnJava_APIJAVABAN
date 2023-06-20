import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		키보드로 짝의 나이를 입력받는다.
		
		 자신의 짝의 이름을 배열에 담으시오
		 대충 3명(본인 포함)
		 각 짝의 나이를 배열에 담으시오.
		 
		 모든 짝의 평균 나이를 출력하시오.
		소수점 3째자리에서 반올림 하시오.
		 */
		Scanner scan = new Scanner(System.in);
		
		double ageAvg = 0;
		
		String[] nameArr = {"손진원", "유효준", "임찬우", "조남용"};
		int[] ageArr = new int[4];
		
		for (int i = 0; i < ageArr.length; i++) {
			System.out.print(nameArr[i] + "\n" + "나이 입력 : ");
			ageArr[i] = scan.nextInt();
		}
		for (int i = 0; i < ageArr.length; i++) {
		ageAvg = ageAvg + ageArr[i];	
		System.out.println(nameArr[i] + " 나이 :" + ageArr[i]);
		}
		ageAvg = (int)((ageAvg / 4) * 100 + 0.5 ) / 100.0;
		
		
		System.out.println("평균 나이는 : " + ageAvg);
	}
}
