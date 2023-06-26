package ezen.tenone;

public class Car {

	String color = "";
	String gearType = "";
	int door = 0;

//	기본 생성자 묵시적
//	기본적으로 매개변수 있는 생성자를 안만들면 알아서 생성되지만
//	매개변수 있는 생성자를 만들면 생성되지 않는다.
//	둘다 사용하고 싶으면 기본 생성자도 명시해야된다.
	Car(){
		
	}
	
//	매개변수 있는 생성자
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
}
