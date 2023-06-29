package one;

public class TestArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10개의 정수값을 가질 수 있는 배열을 만든다
	      
	    //1~12의 값을 배열에 입력하고 출력하시오
		
		int[] arrNum = new int[10];
		//오류
//		for (int i = 0; i <= 12; i++) {
//			arrNum[i] = i + 1;
//		}
//		
//		for (int i = 0; i <= 12; i++) {
//			System.out.println(arrNum[i]);
//		}
		// 어떻게든 해보자
//		for (int i = 0; i < arrNum.length; i++) {
//			arrNum[i] = i + 1;
//		}
//		
//		for (int i = 0; i <= 12; i++) {
//			if (i < arrNum.length) {
//				System.out.print(arrNum[i] + " ");
//			}else if (arrNum[9] == 10) {
//				arrNum[9] = 11;
//				System.out.print(arrNum[9] + " ");
//			}else if (arrNum[9] == 11) {
//				arrNum[9] = 12;
//				System.out.println(arrNum[9] + " ");
//			}
//			
//		}
		
		//이제는 10까지는 완벽하니까
	    //부족한 2개를 위해
	    //새로운 배열 변수를 만든다
	      
	    //10개까지는 기존의 배열에서 값을 받아서 데이터를 입력받는다
	    //나머지 데이터는 새로 받는다
	      
	    //12개의 데이터를 모두 출력한다
		
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = i + 1;
		}
		
		int[] arrNum2 = new int[12];
		
		for (int i = 0; i < arrNum2.length; i++) {
			if (i < arrNum.length) {
				arrNum2[i] = arrNum[i];
			}else if (i >= arrNum.length) {
				arrNum2[i] = i + 1;
			}
		}
		
		for (int i = 0; i < arrNum2.length; i++) {
			System.out.print(arrNum2[i] + " ");
		}
	}

}
