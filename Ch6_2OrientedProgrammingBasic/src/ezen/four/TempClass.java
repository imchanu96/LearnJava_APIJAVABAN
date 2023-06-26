package ezen.four;

public class TempClass {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		System.out.println("secondMethod() 호출됨");
	}
}
