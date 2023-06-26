import java.util.Scanner;

public class MyTvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		하나의 Tv를 만든다
      
      전원은 false
      
      채널은 1채널
      
      볼륨은 10
      
      색상은 원하는 색의 Tv를 만드시오
      
      	출력형태
      	false
      	채널은 1채널
      	볼륨은 10
      	검정색
		*/
		Scanner scan = new Scanner(System.in);
		MyTv2 tv = new MyTv2();
		
		System.out.println("당신의 tv색은 무엇입니까.");
		tv.color = scan.nextLine();
		tv.power();
		if(tv.power) {
			System.out.println("TV의 전원은 : " + !tv.power);
			System.out.println("TV의 전원을 끕니다.");
			
			tv.volume = 10;
			
			System.out.println("볼륨은 " + tv.volume + "입니다.");
			

		}
		
		
	}

}
