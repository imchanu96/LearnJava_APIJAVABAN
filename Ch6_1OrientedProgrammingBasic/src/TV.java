
public class TV {

	/*
	 
	 객체의 구성 요소 - 속성과 기능
	 객체는 속성과 기능 두 종류의 구성요소로 이루어져 있다.
	 
	 속성(property) - 멤버변수, 특성, 필드, 상테
	 기능(function) - 매서드, 함수, 행위
	 
	 TV의 속성 : 크기, 길이, 높이, 색상, 볼륨, 채널등
	 기능 : 전원 켜기, 끄기, 볼륨 높히기, 낮추기, 채널 변경하기등
	 
	 */
	

		String color;
		boolean power = false;
		int channel;
		
		void power() {
			power = !power;
		}
		
		
		
		
		void channelUp() {
			channel++;
		}
		
		void channelDown() {
			channel--;
		}
		
		
		
}


