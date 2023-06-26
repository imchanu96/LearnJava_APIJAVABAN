package ezen.tenthree;

public class Car {

	String color = "";
	String gearType = "";
	int door = 0;

	
	Car(){
		this("", "자동", 10);
		color = "노란색";
	}
	
	/*
	this? 엄청 중요
	- 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
	모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.

	*/
	
//	매개변수 있는 생성자
	Car(String color, String gearType, int door){ //생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void carInfo() {
		System.out.println(this);
		System.out.println("자동차의 색상: " + color);
		System.out.println(gearType);
		
		System.out.println(this.door);
	}
	
}
