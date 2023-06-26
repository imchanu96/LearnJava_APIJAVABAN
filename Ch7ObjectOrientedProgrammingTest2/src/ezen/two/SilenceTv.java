package ezen.two;

public class SilenceTv extends Tv{

	// 음소거 속성을 키거나 끈다
	boolean silence = false;
	
	// 이전 볼륨의 값
	int previousVolume = 0;
	
	/** 
	 * 음소거버튼 기능구현
	 * 버튼을 누를때 마다 음소거 상태는 변경
	 * 음소거 속성이 켜졌는지, 꺼져있는지 
	 * 켜져있으면 ...
	 * 소리를 끈다
	 * 꺼져있으면...
	 * 이전 볼륨으로
	 */
	void silenceButton(){
		silence = !silence;
		if(silence){
			previousVolume = volume;
			volume = 0;
		}else{
			volume = previousVolume;
		}
	}
	
	void stat() { // 오버라이딩으로 silence의 정보도 보여주는걸 만들자
		
		System.out.println("현재 채널 :" + channel); //현재 채널 : ??
		System.out.println("현재 볼륨 :" + volume);  //현재 볼륨 : ??
		System.out.println("현재 음소거 상태 :" + silence); //현재 음소거 상태 : ??
	}
	
}
