package three;

public class Tv {

	private String name = "";
	private int volume = 0;
	private boolean power = false;
	private String powerMessage = "";
	private int channel = 0;

	public Tv() {// 기본 생성자
		super();
	}

	public Tv(String name, int volume, boolean power, int channel) {// 전체 생성자
		super();
		this.name = name;
		this.volume = volume;
		this.power = power;
		this.channel = channel;
		
		

	}
	
	public void power() {
		power = !power;
		
		if (power == true) {
			powerMessage = "티비 ON";
		}else if (power == false) {
			powerMessage = "티비 OFF";
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	볼륨은 1~10볼륨 까지 가능한 한데
//	볼륨업 기능
//	볼륨다운 기능을 구현하시오
//  만약 1에서 볼륨다운을 하면 10이 되어야 한다
//  10에서 볼륨업을 하면 1이 되어야 한다
	public void volumeUp() {
		if (volume >= 1 && volume < 10) {
			volume++;
		} else if (volume >= 10) {
			volume = 1;
		}
	}

	public void volumeDown() {
		if (volume > 1 && volume <= 10) {
			volume--;
		} else if (volume <= 1) {
			volume = 10;
		}
	}

	public void info() {// 모든 정보를 출력하는 메서드
		System.out.println("티비 이름 : " + name);
		System.out.println("티비 전원 상태 : " + powerMessage);
		if (power) {
			System.out.println("티비 채널 : " + channel);
			System.out.println("티비 볼륨 : " + volume);
		}

	}

}
