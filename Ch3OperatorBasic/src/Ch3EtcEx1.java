
public class Ch3EtcEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dNum = 3.141592;
		
		System.out.println(dNum);
		
		/*
		소수점에서 3자리까지만 출력하라
		or
		소수점에서 4번째 자리를 버림 처리하고 출력하시오?
		*/

		double changeDoubleNum = 0.0;

		changeDoubleNum = (int)(dNum *1000) / 1000.0;
		//3.141592*1000 = 3141.592 int로 casting 연산자 
//		-> 3141 -> 3141/1000.0(double) = 3.141
		
		System.out.println(changeDoubleNum);
		
		
		
	}

}
