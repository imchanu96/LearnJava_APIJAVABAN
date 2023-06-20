
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		
		*/

		int[] numArr = {
				1,2
		};
		
		int[] newNumArr = new int[2];

		newNumArr[0] = numArr[0];
		newNumArr[1] = numArr[1];
		
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
