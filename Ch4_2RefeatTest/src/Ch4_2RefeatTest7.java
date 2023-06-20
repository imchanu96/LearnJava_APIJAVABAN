
public class Ch4_2RefeatTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 for문을 이번엔 활용하자
		
		 홀짝을 판별하는 프로그램을 만드시오.
		 
		 출력 형태
		 2
		 짝
		 or
		 3
		 홀
		 
		 이걸 총 3번 반복한다.
		 
		 */
		
		String str = "";
	
		for (int i = 1; i <=3; i++) {
			if(i % 2 == 1) {
				str = "홀";
				System.out.println(i);
				System.out.println(str);
			}else {
				str = "짝";
				System.out.println(i);
				System.out.println(str);
			}
			
			
		}
		
		
	}
}
		



