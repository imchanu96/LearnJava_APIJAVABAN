package ezen.etc;

public class ReturnTest {

	public static void main(String[] args) {
		
		ReturnBasic rb = new ReturnBasic();
		
		int n = 10;
		int m = 20;
		int sum = 0;
		
		sum = rb.sumPrint(n, m);
		
		System.out.println(sum);
	}
}
