package three;

import java.util.Scanner;

public class UserInputCalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자로 부터 숫자를 입력받아서
//		무조건 10을 곱하는 프로그램을 완성하시오
		
//		단, 사용자로부터 입력받을 때 무조건 nextLine(메서드)를 사용한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력해주세요");
		String userStr = "";
		
		userStr = scan.nextLine();
		
		System.out.print("결과값 : " + Integer.parseInt(userStr) * 10);
	}

}
