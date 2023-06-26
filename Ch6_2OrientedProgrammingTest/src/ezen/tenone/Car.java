package ezen.tenone;

public class Car {

	String color = "";
	String gearType = "";
	int door = 0;

//	기본 생성자 만들기

	Car(){
		color = "빨간색";
		gearType = "auto";
		door = 3;
	}
	
	void carInfo() {
		System.out.println("자동차의 색상: " + color);
		System.out.println(gearType);
		
		System.out.println(door);
	}
	
}
