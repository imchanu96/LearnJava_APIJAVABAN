
public class TV3 {
// 		TV의 속성 클래스
	
//		TV의 속성(멤버변수)
		String color;
		boolean power = false;
		int channel = 0;
		
		
//		TV의 기능(메서드)
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


