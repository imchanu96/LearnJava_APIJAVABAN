package etc.one;

import java.util.Random;

public class UtilRandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
//		int num = rand.nextInt();
//
//		System.out.println(num);
		int num = 0;
		Random rand2 = new Random(10);
		Integer randNum = 0;
		
		
		for (int i = 0; i < 5; i++) {
			num = rand.nextInt();
			System.out.println("위 : " + num);
			randNum = rand2.nextInt();
			System.out.println("아래: " + randNum);
			
		}
	
		num = rand.nextInt(3);

		System.out.println(num);
	}

}
