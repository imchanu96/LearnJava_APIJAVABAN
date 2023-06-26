package b;

public class OptimizeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];

		numberLookup(numArr);
	}

	static void numberLookup(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < 2; i++) {
			System.out.println("숫자를 조회합니다.");
			for (int j = 0; j < numArr.length; j++) {
				System.out.print(numArr[j] + " ");
			}
			System.out.println();
		}

	}

}