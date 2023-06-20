
public class Ch3EtcEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dNum = 3.141592;
		double dNum1 = 3.141192;
		
		System.out.println(dNum);
		
		/*
		소수점에서 3자리까지만 출력하라
		or
		소수점에서 4번째 자리를 반올림 처리하고 출력하시오?
		*/

		double changeDoubleNum = 0.0;
		
		
		changeDoubleNum = (int)(dNum *10000 + 5) / 10 / 1000.0;
//		= 3.141592 * 10000 + 5 = 31415.92 + 5 = 31420.92  
//		= (int)(31420.92) = 31420 / 10  소수점 제거
//		= 3142 / 1000.0 = 3.142
		
		System.out.println(changeDoubleNum);
		
		changeDoubleNum = (int)(dNum1 *10000 + 5) / 10000.0;
//		= 3.141192 * 10000 + 5 = 31411.92 + 5 = 31416.92  
//		= (int)(31416.92) = 31416
//		= 31416 / 10000.0 = 3.1416
		
		System.out.println(changeDoubleNum);
	
	}

}
