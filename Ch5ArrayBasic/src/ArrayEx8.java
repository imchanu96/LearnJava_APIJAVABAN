
public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 배열의 복사?
		 (잘못 생각한 복사의 방식의 예)
		*/

		int[] numArr = {
				1,2
		};
		
		int[] newNumArr = new int[2];

		newNumArr = numArr;
//		배열 인덱스에 담긴 값이 저장 되는게 아니라 주소를 저장한다
		
		
		System.out.println("=============원본 내용==========");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(numArr[i]);
			
		}
		
		System.out.println("=============복사 내용==========");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
		
		newNumArr[0] = 999;
		
		System.out.println("=============원본 내용==========");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		System.out.println("=============복사 내용==========");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
	
	}
}
