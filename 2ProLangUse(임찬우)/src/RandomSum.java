import java.util.Scanner;

public class RandomSum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int randNum = 0;
		int sum = 0;
		
		System.out.println("난수의 개수를 입력하세요");
		num = scan.nextInt();
		System.out.println("\n" + "==== 난수의 숫자들 ====");
		for (int i = 0; i < num; i++) {
			randNum = ((int)(Math.random()*10)) + 1;
			System.out.print(randNum);
			if (i < num - 1) {
				System.out.print(", ");
			}
			sum = sum + randNum;
		}
		System.out.println("");
		System.out.println("==== 1~10 사이의 난수 4개의 합계 ====" 
		+ "\n" + sum);
	}
}
