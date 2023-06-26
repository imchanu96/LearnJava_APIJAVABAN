package ezen.six;

public class Child3 extends Parent3 {

	int x = 20;
	int y = 200;
	
	
//	void method() {
//		System.out.println("x: " + x);
//		System.out.println("this.x: " + this.x);
//		System.out.println("super.x: " + super.x);
//	}
	
	void method() {
		super.method();
		System.out.println("Child3: " + y);
		
	}
	
}
