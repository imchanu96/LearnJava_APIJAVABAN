
public class Ch4_2RefeatTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1부터 15까지의 정수 중에서 
		 3의 배수를 제외한 수들의 합을 구하는 프로그램을 작성하시오.
		 
		 */

		int sum = 0;
		int num = 1;

		while(num <= 15) {
			if(num % 3 != 0) {
			sum = sum + num;
			num++;
			}
		}	
		System.out.println(sum);
	}
}
		



