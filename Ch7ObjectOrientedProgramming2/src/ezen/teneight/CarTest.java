package ezen.teneight;

public class CarTest {

	/*
	
	*/
	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = null;
//		Ambulance am = null;
		
		System.out.println(car);
		System.out.println(fe);
		car.drive();
		fe.water();
		
		fe = (FireEngine)car;
		System.out.println(car);
		System.out.println(fe);
		fe.water();
		fe.drive();
		
//		am = (Ambulance)car;
//		am.siren();
//		am.drive();
		
		

	}
	
}
