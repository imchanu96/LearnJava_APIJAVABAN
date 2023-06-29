package one;

public class Ch8ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 *1~10까지의 숫자를 담을 수 있는 배열이 있다
     *
     *만약 배열의 값을 벗어나는 인덱스 값을 배열에서 접근했다면 발생할 수 있는
     *문제를 예외처리 하시오
     *
     *ex: 11번째 위치 접근시 오류가 발생했다면
     *그 값은 배열의 위치를 벗어났습니다 0~9사이만 접근이 가능하다 
     *식으로 문자열을 출력하시오
	 * 
	 */
		int[] arrNum = new int[10];
		
		//배열에 값 정의
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
		}

		try {
			System.out.println(arrNum[9]);
			System.out.println(arrNum[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("그 값은 배열의 위치를 벗어났습니다 ");
			System.out.println("0~9사이만 접근이 가능하다");
		}
		
		// 배열의 인덱스 0~10까지 접근해서 
		// 오류 발생 (인덱스가 0~9밖에 없음)
		try {
			for (int i = 0; i <= arrNum.length; i++) {
				System.out.println(arrNum[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("그 값은 배열의 위치를 벗어났습니다 ");
			System.out.println("0~9사이만 접근이 가능하다");
		}
		
	}

}
