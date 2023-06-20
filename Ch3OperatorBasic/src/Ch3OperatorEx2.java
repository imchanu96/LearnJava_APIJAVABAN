
public class Ch3OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사칙 연산자
		  
		int num = 10;
		int num2 = 4;
		double resultNum = 0.0;
		
		//
		
		System.out.println(num + " + " + num2 + " = " + (num + num2));
		System.out.println(num + " - " + num2 + " = " + (num - num2));
		System.out.println(num + " * " + num2 + " = " + (num * num2));
		System.out.println(num + " / " + num2 + " = " + (num / num2));
		System.out.println(num + " / " + num2 + " = " + ((double)num / num2));
		System.out.println(num + " / " + num2 + " = " + (double)(num / num2));
		
		
		//보다 깔끔
		
		System.out.print(num + " + " + num2 + " = ");
		System.out.println(num + num2);
		System.out.print(num + " - " + num2 + " = ");
		System.out.println(num - num2);
		
		// 보다 깔끔
		
		resultNum = num + num2;
		System.out.print(num + " + " + num2 + " = " + resultNum);
		
	}

}
