import java.util.Scanner;

public class KeyboardInputEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		
		System.out.println("숫자를 입력하세요.");
		
		num = scan.nextInt();
		
		System.out.println("입력한 숫자는 : " + num + "입니다.");
		
		System.out.println("곱할 숫자를 입력해주세요.");
		
		num2 = scan.nextInt();
		
		System.out.println("결과는 : " + num * num2 + "입니다");
		
		
	}

}
