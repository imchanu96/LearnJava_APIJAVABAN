package ezen.nine;

public class Calc {

	
	int add(int a, int b) {
		System.out.println("int add(int a, int b) {");
		
		return a + b;
	}
	long add(int a, long b) {
		System.out.println("long add(int a, long b) {");
		
		return a + b;
	}
	long add(long a, int b) {
		System.out.println("long add(long a, int b) {");
		
		return a + b;
	}
	long add(long a, long b) {
		System.out.println("long add(long a, long b) {");
		
		return a + b;
	}
	
	/*
	 더하기 메서드에 배열값들의 모든 숫자를 더하는 메서드를 추가하시오
	 
	 나누기
	 */
	int addArr(int[] numArr) {
		System.out.println("int add(int a, int b) {");
		int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		
		return sum;
	}
	long addArr(long[] numArr) {
		System.out.println("int add(int a, int b) {");
		long sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		
		return sum;
	}
	double addArr(double[] numArr) {
		System.out.println("int add(int a, int b) {");
		double sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		
		return sum;
	}
	 
	
}
