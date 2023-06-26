package ezen.tenthree;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Time time = new Time();
		
		
//		time.hour = 19;
//		time.minute = 20;
		time.timeInfo();
//		time.timeInfo2();
		
		Time time2 = new Time(21, 15, 30);
		time2.timeInfo();
		
//		System.out.println(time2.now(21, 36, 00));
		time.now(21, 36, 00);
	}

}
