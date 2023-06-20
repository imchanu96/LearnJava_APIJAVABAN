import java.util.Scanner;

public class Ch4_2RefeatTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 구구단
		 
		 2 * 1 = 2
		 2 * 2 = 4
		 2 * 3 = 6
		 
		 2 * 9 = 18
		 */
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		int num = 2;
		int result = 0;
		
		for (int i = 1; i <= 9; i++) {
			result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
		
		
	}
}
		



