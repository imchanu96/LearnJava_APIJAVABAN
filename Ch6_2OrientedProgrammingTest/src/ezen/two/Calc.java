package ezen.two;

public class Calc {

	
	int add(int a, int b) {
		int result = 0;
		result = a + b; 
		return result;
	} 
	//add1번째 int , int
	long add(long a, int b) {
		long result = 0;
		result = a + b; 
		return result;
	} 
	//add2번째 long , int
	long add(int a, long b) {
		long result = 0;
		result = a + b; 
		return result;
	} 
	//add3번째 int , long
	long add(long a, long b) {
		long result = 0;
		result = a + b; 
		return result;
	} 
	//add4번째 long , long
	double add(double a, int b) {
		double result = 0;
		result = a + b; 
		return result;
	} 
	//add5번째 double , int
	double add(int a, double b) {
		double result = 0;
		result = a + b; 
		return result;
	} 
	//add6번째 int , double
	double add(double a, double b) {
		double result = 0;
		result = a + b; 
		return result;
	} 
	//add7번째 double , double
	double add(long a, double b) {
		double result = 0;
		result = a + b; 
		return result;
	} 
	//add8번째 long , double
	double add(double a, long b) {
		double result = 0;
		result = a + b; 
		return result;
	} 
	//add9번째 double , long
//////////////////////////////////////////////////////	
	double div(int a, int b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div1번째 int , int
	double div(long a, int b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div2번째 long , int
	double div(int a, long b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div3번째 int , long
	double div(long a, long b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div4번째 long , long
	double div(double a, int b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div5번째 double , int
	double div(int a, double b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div6번째 int , double
	double div(double a, double b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div7번째 double , double
	double div(long a, double b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div8번째 long , double
	double div(double a, long b) {
		double result = 0;
		result = ((double)a / b); 
		return result;
	} 
	//div9번째 double , long
	
	
	
	
	
	
	
	
	
	
	
	
////////////////////////////////////////////////////	
	int addArr(int[] arr1) {
		int result = 0;
		for (int i = 0; i < arr1.length; i++) {
			result = result + arr1[i]; 	
		}
		
		return result;
	} 
	//addArr 1번째 int
	long addArr(long[] arr1) {
		long result = 0;
		for (int i = 0; i < arr1.length; i++) {
			result = result + arr1[i]; 	
		}
		
		return result;
	} 
	//addArr 2번째 long
	double addArr(double[] arr1) {
		double result = 0;
		for (int i = 0; i < arr1.length; i++) {
			result = result + arr1[i]; 	
		}
		
		return result;
	} 
	//addArr 3번째 double
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
