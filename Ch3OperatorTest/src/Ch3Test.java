import java.util.Scanner;

public class Ch3Test {

	public static void main(String[] args) {
	
		int num = 0;
		String str = "";
	
	
		num = 1;
		str = (num % 2 >= 1) ? "홀" : "짝";
		System.out.println(num);
		System.out.println(num + "은 " + str + "입니다.");
		
		System.out.println();
		
		num = 10;
		str = (num % 2 == 1) ? "홀" : "짝";
		System.out.println(num);
		System.out.println(num + "은 " +str + "입니다.");
	
	}
}
