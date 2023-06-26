package ezen.one;

public class SilenceTv extends Tv { // TV기능 물려받기

	/*
	 * 버튼을 누를때 마다 음소거 상태는 변경
	 * 
	 * 음소거 속성이 켜졌는지, 꺼져있는지 켜져있으면 ... 소리를 끈다 꺼져있으면... 이전 볼륨으로
	 */

	boolean silence;
	int volumeSave;

	void silenceButton() {
		silence = !silence; // 음소거버튼 기능구현

		if (silence == true) { // 음소거 속성을 키거나 끈다
			volumeSave = volume; // 이전 볼륨의 값
			volume = 0;

		} else if (silence == false) {
			volume = volumeSave;

		}

	}
}
