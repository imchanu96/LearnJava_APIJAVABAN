
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		클래스 클래스 
		TV tv;
//		클래스 -> 인스턴스화 -> 인스턴스(객체)
		tv = new TV();
//		객체를 사용할때는 꼭 new를 붙혀야 주소가 할당된다.
		
//		tv 전원 킨다.
		tv.power();
		if (tv.power) {
			System.out.println("tv 전원을 킨다.");
		}
		
		
//		tv 채널을 1로 설정한다.
		tv.channel = 1;
		for (int i = 0; i < 4; i++) {
			tv.channelUp();
		}
	
		
		
//		현재 채널을 확인한다.
		//메서드 
		System.out.println("현재 채널은  " + tv.channel + " 입니다.");
		
		
	}

}
