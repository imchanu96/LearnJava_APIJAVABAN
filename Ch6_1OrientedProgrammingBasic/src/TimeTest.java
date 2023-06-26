
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		객체지향적인 코드
//		객체지향
		
		Time koreaTime = new Time();
		Time americaTime = new Time();
		Time ukTime = new Time();
		
//		koreaTime.hour = 2;
//		koreaTime.minute = 10;
//		koreaTime.second = 30;
		
		koreaTime.setHour(2);
		koreaTime.setMinute(10);
		koreaTime.setSecond(30);
		
		System.out.println("korea 시 : "  + koreaTime.getHour() + " korea 분 : " 
		+ koreaTime.getMinute() + "korea 초 : " + koreaTime.getSecond() );
		
		
		americaTime.setHour(2);
		americaTime.setMinute(10);
		americaTime.setSecond(30);
		
		System.out.println("america시 : " + americaTime.getHour() + " america분 : " 
		+ americaTime.getMinute() + " america초 : " + americaTime.getSecond() );
		
		
		ukTime.setHour(11);
		ukTime.setMinute(20);
		ukTime.setSecond(40);
		
		System.out.println("uk시 : " + ukTime.getHour() + " uk분 : " 
		+ ukTime.getMinute() + " uk초 : " + ukTime.getSecond() );
		
		
	}

}
