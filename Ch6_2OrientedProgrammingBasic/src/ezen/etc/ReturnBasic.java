package ezen.etc;

public class ReturnBasic {

	int sumPrint(int n, int m) {
		
		int sum = 0;
		
		for (int i = n; i <= m; i++) {
			sum = sum + i;
			
//			if (sum > 100) {
//				return sum;
//			}
		}
		
		return sum;
	};
}
