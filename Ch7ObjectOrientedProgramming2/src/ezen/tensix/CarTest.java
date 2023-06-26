package ezen.tensix;

public class CarTest {

	/*
	참조변수의 형변환
	기본형 변수와 같이 참조변수도 형변환이 가능하다.
	단, 서로 상속관계에 있는 클래스에서만 가능하기 때문에
	자식타입의 참조변수를 조상타입의 참조변수로
	부모타입의 참조 변수를 자식 타입의 참조변수로의 형변환만 가능하다.
	
	자손타입 -> 조상타입(Up-Casting): 형변환 생략가능
	자손타입 <- 조상타입(Down-Casting): 형변환 생략불가
	*/
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		
		
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;                // 묵시적 형변환   명시적으로 바꾸면  car = (car)fe;
//		car.water();
		
		car = new Car();
		car.stop();
		car.drive();
		
//		fe2 = car;
		fe2 = (FireEngine)car;   // 캐스팅연산자(형변환)을 사용하여 부모 참조변수 값을 자식에게 담을수 있다.
		fe2.water();
		
	}
	
}
