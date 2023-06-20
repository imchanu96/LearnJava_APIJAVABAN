import java.util.Scanner;

public class Ch4_1ConditionTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 사계절 
		 봄여름가을겨울
		 1~12
		 
		 출력 예시
		 현재 월을 입력하세요 . 
		 현재의 계절은 봄입니다.
		 
		 봄 3~5
		 여름 6~8
		 가을 9~11
		 겨울 12~2
		
		 *
		 */
		int num = 0;
		String giftStr = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요. ->");
		
		num = scan.nextInt();
		giftStr = "현재의 계절은 ";
				
		System.out.println("봄(3~5), 여름(6~8), 가을(9~11), 겨울(12~2)");
		
		switch (num) {
			case 3: case 4: case 5:
				System.out.println(giftStr + "봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(giftStr + "여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(giftStr + "가을입니다.");
				break;
			case 12: case 1: case 2:
				System.out.println(giftStr + "겨울입니다.");
				break;
			default:
				System.out.println("1~12 사이의 숫자를 입력해주세요.");
				break;
		}

	}
}
