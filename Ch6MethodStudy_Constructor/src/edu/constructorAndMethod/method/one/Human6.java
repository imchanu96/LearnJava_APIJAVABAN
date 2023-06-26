package edu.constructorAndMethod.method.one;

public class Human6 {
	String name = "";
	int age = 0; // 나이
	double weight = 0; // 몸무게
	
//	bulidingName은 클래스의 연관성, 특징이 없기 때문에 인스턴스 변수로 생성하는것은 객체지향적이 아니다.
//	그로 인해 bulidingName는 매개변수로 준다.
	
//	매개변수는 기본 정보에서 추가? 변경?을 해야할때 사용하게 된다. 
//	(사용자 지정이나 기타등등 약간의 커스텀마이징 할수 있는것들)
	void goBuilding(String bulidingName) {

		String str = "";
	
		str = name + " " + bulidingName + "에 간다";

		System.out.println(str);
	}

	void myInfoView() {
		String humanInfoStr = "";
		String title = "";
		title = "나의 정보";
		System.out.println("=============");
		System.out.println(title);

		humanInfoStr = "이름: " + name;
		System.out.println(humanInfoStr);

		humanInfoStr = "나이: " + age;
		System.out.println(humanInfoStr);

		humanInfoStr = "몸무게: " + weight;
		System.out.println(humanInfoStr);

		System.out.println("=============");

	}
}
