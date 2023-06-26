package c;

import java.util.Scanner;

public class ExternalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum = 0;
		Scanner scan = new Scanner(System.in);
		
		gameStart();				// 게임 시작시 문구
		userNum = scan.nextInt();	// 숫자 선택
		diceGame(userNum);  		// 다이스 숫자 맞추기 게임 실행
		
		scan.close();
	}
	
	static void gameStart() {
		System.out.println("=== 주사위 맞추기 ===");
		System.out.println("주사위가 던져졌습니다.");
		System.out.println("주사위 숫자는 무엇일까요?");
		System.out.println("기회는 한 번뿐이니"
				+ " 신중히 입력해주세요!!");
		System.out.println();
		System.out.print("숫자를 입력해주세요(1~6)>>     ");
	}
	
	static void diceGame(int userNum) {
		int diceNum = 0;
		
		diceNum = (int)(Math.random() * 6) + 1;
		
		System.out.println("주사위 숫자  :유저의 숫자");
		System.out.println(diceNum + "\t" + ":" + userNum);
		
		if (userNum == diceNum) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
		
	}

}
