import java.util.Scanner;

public class Ch4_1ConditionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * if else
		 * 
		 * 홀짝 판별 프로그램을 만드시오
		 * 
		 * 사용
		 * 자로부터 입력을 받음
		 * 
		 * 출력 예시 
		 * 
		 * 홀짝? 1 
		 * 홀
		 * 
		 * 홀짝? 12 
		 * 짝
		 */
		int num = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("홀짝? ");

		num = scan.nextInt();

		if (num % 2 == 1) {
			System.out.println("홀");
		} else {
			System.out.println("짝");
		}

	}

}
