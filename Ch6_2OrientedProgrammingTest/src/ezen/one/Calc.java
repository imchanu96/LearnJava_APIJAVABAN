package ezen.one;

// Calculator
public class Calc {

//	사칙연산을 수행하는 메서드를 구현하시오
	
	void add(int a, int b) {
		int result = 0;
		
		result = a + b;
		System.out.println(" + : " + result);
	}
	
	void sub(int a, int b) {
		int result = 0;
		
		result = a - b;
		System.out.println(" - : " + result);
	}
	
	void mul(int a, int b) {
		int result = 0;
		
		result = a * b;
		System.out.println(" * : " + result);
	}
	
	void div(double a, double b) {
		double result = 0;
		
		result = (int)((a / b) * 10) / 10.0  ;
		System.out.println(" / : " + result);
	}
}
