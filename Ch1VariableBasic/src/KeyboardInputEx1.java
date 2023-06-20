import java.util.Scanner; // Scanner라는 클래스를 포함 시켜야 오류 안뜸

public class KeyboardInputEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double num = 0;
		int ten = 0;

		System.out.println("숫자 하나를 입력해주세요.");
		num = scan.nextInt();

		System.out.print("당신이 입력한 숫자는 : ");
		System.out.println(num * ten + " 입니다.");
		System.out.println("(당신이 입력한 수의 *10입니다.)");

		System.out.println(num / ten + " 입니다.");
		System.out.print("(당신이 입력한 수의 10을 나눈 수입니다.)");

	}

}
