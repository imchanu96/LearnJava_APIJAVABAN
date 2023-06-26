
public class TimeProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		비객체지향적인 코드
//		절차지향
		int korHour = 0;
		int korMinute = 0;
		double korSecond = 0.0;
		int chiHour = 0;
		int chiMinute = 0;
		double chiSecond = 0.0;
		int jaHour = 0;
		int jaMinute = 0;
		double jaSecond = 0.0;
				
		  korHour = 2;
		  korMinute = 30;
		  korSecond = 20;
		  chiHour = 2;   
		  chiMinute = 50;
		  chiSecond = 30;
		  jaHour = 2;
		  jaMinute = 10; 
		  jaSecond = 10;
		
		System.out.println("한국 시간 : " + "시 : " + korHour 
				+ " 분 : " + korMinute + " 초 : " +korSecond );
		System.out.println("중국 시간 : " + "시 : " + chiHour 
				+ " 분 : " + chiMinute + " 초 : " +chiSecond );
		System.out.println("일본 시간 :" + "시 : " + jaHour 
				+ " 분 : " + jaMinute + " 초 : " +jaSecond );
	}

}
