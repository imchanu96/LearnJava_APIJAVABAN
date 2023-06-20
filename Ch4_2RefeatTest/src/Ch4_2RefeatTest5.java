
public class Ch4_2RefeatTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 0 + 1	1
		 1 + 2	3
		 3 + 3	6
		 6 + 4	10
		 ...
		 ...
		 ...
		 100이 넘는 숫자를 찾아라
		 
		 출력 형태
		 1
		 3
		 6
		 10
		 ...
		 ...
		 100넘는 숫자 출력
		 
		 00번째 : 100넘는 숫자이다.
		 */

		int num = 0;
		int num1 = 0;
		while(num++ <= 100 && num1 <= 100) {
			num1 = num + num1;
			
//			System.out.print(num - 1 + "+" + num1 + " = ");
			System.out.println(num1);
			
			
		}
		
		System.out.println(num -1 + " 번째 : " + num1);
		
	}	
}
		



