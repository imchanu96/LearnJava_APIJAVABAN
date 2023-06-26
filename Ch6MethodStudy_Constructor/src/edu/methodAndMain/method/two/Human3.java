package edu.methodAndMain.method.two;

public class Human3 {
	String name = "";
	int age = 0;  //나이
	double weight = 0;  // 몸무게
	
	
	 void goHome() {
		
		String str = "";

		str = name + ", 나이 : " + age + ", 몸무게: " + weight + " 집에 간다";

		System.out.println(str);
	}
}
