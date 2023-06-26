package ezen.tentwo;

public class Car {

	String color = "";
	String gearType = "";
	int door = 0;

//	기본 생성자
//	기본적으로 매개변수 있는 생성자를 안만들면 알아서 생성되지만
//	매개변수 있는 생성자를 만들면 생성되지 않는다.
//	둘다 사용하고 싶으면 기본 생성자도 명시해야된다.
	Car(){
		
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
		System.out.println("자동차의 색상: " + color);
		System.out.println(gearType);
		
		System.out.println(this.door);
	}
	
}
