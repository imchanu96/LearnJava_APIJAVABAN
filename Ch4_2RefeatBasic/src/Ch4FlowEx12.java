
public class Ch4FlowEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 반복문
		 * 
		 * 어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
		 * 
		 * for문 표현식 for(초기화; 조건식; 증감식) { 조건식이 참일 때 수행될 문장들을 적는다. }
		 * 
		 * 초기화 : 반복문에 사용될 변수를 초기화하는 부분이며 처음에 한번만 수행된다.
		 * 
		 * 조건식 : 참/거짓을 반복하면서 판단한다. 거짓인 경우 for문을 벗어난다.
		 * 
		 * 증감식 : 반복문을 제어하는 변수의 값을 증가 또는 감소시킨다.
		 * 
		 */

		for (int i = 0; i <= 4; i++) {
			System.out.println("I can do it" + (i+1) + "번쨰");

		}
		
	}
}
