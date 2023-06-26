import java.util.Scanner;

public class CalculaterExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*키보드로 두 개의 숫자를 입력받는다.
		 * 
		 *두 숫자를 곱한다.
		 * 
		 *결과를 출력한다.
		 * 
		 *방법
		 *1. 두 개의 변수를 선언
		 *2. 키보드 입력 선언
		 *3. 사용자에게 숫자를 입력하는 메세지 출력
		 *4. 변수에 할당
		 *5. 결과 출력
		 * 
		 * 출력 형태
		 * 
		 *사용자님 첫 번째 숫자를 입력해주세요.
		 *12
		 *사용자님 두번째 숫자를 입력해 주세요.
		 *10
		 * 
		 *결과 : 120
		 * 
		 *프로그램을 종료합니다.
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		double num3 = 0;
		
		
		System.out.println("사용자님 첫 번째 숫자를 입력해주세요.");
		num1 = scan.nextInt();
		
		
		System.out.println("사용자님 두번째 숫자를 입력해주세요.");
		num2 = scan.nextInt();
		
		num3 = (double) num1*num2;
		
		System.out.println("\n결과 : " + (double)num3);
		System.out.println("\n결과 : " + num3);
		
		System.out.println("프로그램을 종료합니다.");
	}

}
