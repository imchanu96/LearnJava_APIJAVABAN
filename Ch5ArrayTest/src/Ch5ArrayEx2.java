import java.util.Scanner;

public class Ch5ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 총점과 평균을 구하자
		 
		 국영수 3개의 점수의 촘점과 평균구하기
		 평균은 소수점 3번째에서 올림한다.
		 
		 출력형태
		 총점 : ???
		 평균 : ???
		 
		 */

		Scanner scan = new Scanner(System.in);
		
		double[] score = new double[4];
		double avg = 0; 
		
		System.out.println("국어 점수를 입력하세요");
		score[0] = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		score[1] = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		score[2] = scan.nextInt();
		
		score[3] = score[0] + score[1] + score[2];
		
		System.out.println("입력하신 값" + "\n" + "국어 :" + score[0] 
				+ "영어 : " +score[1] + "수학 : " + score[2] );
		System.out.println("총점은 : " + score[3]);
//		avg = (int)(score[3] / 3 * 100 + 1) / 100.0;
		avg = ((int)((score[3] / 3.0 + 0.009) *100)) / 100.0;
		System.out.println("평균은 : " + avg + "입니다.");

	}

}
