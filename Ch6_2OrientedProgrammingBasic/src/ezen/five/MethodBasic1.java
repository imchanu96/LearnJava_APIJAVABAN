package ezen.five;

public class MethodBasic1 {
	
	int num = 0;
	static int staticNum = 10;
	
	void instanceMethod() {
		System.out.println(num);
		System.out.println(staticNum);
	}

	static void staticMethod() {
//		System.out.println(num);
//		num은 인스턴스 변수이기 때문에 새로 선언 해줘야함
//		대신 선언하면 지역변수로 됨
		System.out.println(staticNum);
	}
	
	public static void main(String[] args) {
		MethodBasic1 mb = new MethodBasic1();
	
	mb.instanceMethod();
	mb.staticMethod();
	staticMethod();
	}
}
