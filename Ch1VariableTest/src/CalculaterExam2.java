import java.util.Scanner;

public class CalculaterExam2 {

	public static void main(String[] args) {

//		키보드로 두 개의 숫자를 입력받는다

//		두 숫자를 곱한다

//		결과를 출력한다

//		방법
//		1세 개의 변수를 선언

//		2키보드 입력 선언
//		
//		3사용자에게 숫자를 입력하라는 메시지 출력
//		4변수에 할당
//		
//		5결과 출력

//		출력 형태
//		사용자님 첫 번째 숫자를 입력해주세요.
//		12000
//		사용자님 첫 번째 숫자를 입력해주세요.
//		1000000
//		
//		결과: 1200000
//		
//		프로그램을 종료합니다

		Scanner scan = new Scanner(System.in);
		long firstNum = 0;
		long secondNum = 0;
		int num = 0;

		System.out.println("사용자님 첫 번째 숫자를 입력해주세요.");
		firstNum = scan.nextInt();

		System.out.println("사용자님 두 번째 숫자를 입력해주세요.");
		secondNum = scan.nextInt();
		
//		num = (int)(firstNum * secondNum); 다른 방법
		num = (int)firstNum * (int)secondNum;
		
		System.out.println();
		System.out.println("결과: " + num);

		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	}

}
