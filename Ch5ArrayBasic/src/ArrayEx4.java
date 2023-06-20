
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

		 */
		
		int[] numArr = {
				1, 5, 3, 10, 7
		};
		int tempNum = 0;
		
		System.out.print("현재 배열 : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println();
		
//		오름차순 정렬한다.
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length-1; j++) {
				if(numArr[j] > numArr[j+1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tempNum;
				}
			}
		} // 첫번째 for문 종료	
		System.out.print("오름차순 : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println("");
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length-1; j++) {
				if(numArr[j] < numArr[j+1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tempNum;
				}
			}
		} // 첫번째 for문 종료
		System.out.print ("내림차순 : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
	}
}
