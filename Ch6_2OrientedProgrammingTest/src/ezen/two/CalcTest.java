package ezen.two;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int[] arr1 = {
				1, 2, 3, 4, 5
		};
		long[] arr2 = {
				6L, 7L, 8L, 9L, 10L
		};
		double[] arr3 = {
				6.6, 7.7, 8.8, 9.9, 10.10
		};
		Calc calc = new Calc();
		
//		calc.add(a, b);
//		System.out.println(calc.add(1, 20));
//		System.out.println(calc.add(2L, 20));
//		System.out.println(calc.add(3, 20L));
//		System.out.println(calc.add(4L, 20L));
//		System.out.println(calc.add(5.5, 20));
//		System.out.println(calc.add(6, 20.20));
//		System.out.println(calc.add(7.7, 20.20));
//		System.out.println(calc.add(8L, 20.20));
//		System.out.println(calc.add(9.9, 20L));
		
		
		System.out.println(calc.div(1, 20));
		System.out.println(calc.div(2L, 20));
		System.out.println(calc.div(3, 20L));
		System.out.println(calc.div(4L, 20L));
		System.out.println(calc.div(5.5, 20));
		System.out.println(calc.div(6, 20.20));
		System.out.println(calc.div(7.7, 20.20));
		System.out.println(calc.div(8L, 20.20));
		System.out.println(calc.div(9.9, 20L));
		
		
//		System.out.println(calc.addArr(arr1));
//		System.out.println(calc.addArr(arr2));
//		System.out.println(calc.addArr(arr3));
		
	}

}
