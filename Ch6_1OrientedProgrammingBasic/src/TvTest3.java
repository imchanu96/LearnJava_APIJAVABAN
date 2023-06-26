
public class TvTest3 {
// 클래스 코드는 메인 함수가 있는 클래스에서만 실행이 가능하다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스 타입 참조변수 = 뉴 클래스명();
//							객체 선언
//			참조변수(reference)
		TV3 tv = new TV3();
		TV3 tv2 = new TV3();
		

		
		System.out.println("tv1의 channel 값 : " + tv.channel);
		System.out.println("tv2의 channel 값 : " + tv2.channel);
		
		tv2 = tv;
//		인스턴스(객체) 변수

		tv.channel = 7;
		System.out.println("tv의 값을 7로 변경함.");
		
		System.out.println("tv1의 channel 값 : " + tv.channel);
		System.out.println("tv2의 channel 값 : " + tv2.channel);
	}

}
