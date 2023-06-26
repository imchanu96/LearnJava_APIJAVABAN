package ezen.three;

public class CaptionTv extends Tv{ 

	boolean caption = false;
	
	void displayCaption(String text) {
		
		if (caption == true) { // 캡션 상태가 true이면 text가 출력된다.
			System.out.println(text);
		}
	}
		
}
