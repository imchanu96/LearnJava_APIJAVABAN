import java.util.Scanner;

public class Ch4_1ConditionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      성적처리 프로그램
//
//      90이상이면 A등급
//      80이상이면 B등급
//      70이면 C등급
//      나머지 점수는 F등급
//
//      출력 ex
//      94
//      A등급입니다
//      아니면 
//      82
//      B등급입니다
//      70
//      C등급입니다
//      60
//      F등급입니다

		Scanner scan = new Scanner(System.in);

		int score = 0;
		String str = "";

		score = scan.nextInt();

		str = "등급입니다.";
		
		if (score >= 90) {
			System.out.println("A" + str);
		} else if (score >=80) {
			System.out.println("B" + str);
		} else if (score >= 70) {
			System.out.println("C" + str);
		} else {
			System.out.println("F" + str);
		} 
	}
}
