package edu.methodAndMain.method.two;

public class Human4 {
	String name = "";
	int age = 0;  //나이
	double weight = 0;  // 몸무게
	
	
	 void goHome() {
		
		String str = "";

		str = name + ", 나이 : " + age + ", 몸무게: " + weight + " 집에 간다";

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
