package edu.methodAndMain.method.two;

public class HumanTest4 {
	// 증명해보자
	// 메서드를 써야하는 이유
	// 프로그래밍을 할 때 주의할 점
	// 같은 코드를 반복하지 않는다
	// 한번 작성한 코드는 언제든 바뀔 수 있다는 것을 생각하자
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메서드를 써야 하는 이유");
		System.out.println("여러 명이라면?");
		
		System.out.println("사람의 특징에 나이와 키가 추가 된다면?");
		System.out.println("하나가 변경되면 중요한 로직들이 전부 변하는 힘");
		System.out.println("이것이 메서드를 사용하는 이유 중 하나다");
		System.out.println("유지보수 개발에 진가가 발휘됨");
		
//		사람의 정보만 보고 싶은 경우?
		
		Human4 human = new Human4();
		
		human.name = "홍길동";
		human.age = 30;
		human.weight = 70.1;
		human.goHome();
		human.myInfoView();

		Human4 human2 = new Human4();
		human2.name = "일지매";
		human2.age = 40;
		human2.weight = 80;
		human2.goHome();
		human2.myInfoView();

		Human4 human3 = new Human4();
		human3.name = "성춘향";
		human3.age = 20;
		human3.weight = 58;
		human3.goHome();
		human3.myInfoView();

		Human4 human4 = new Human4();
		human4.name = "임꺽정";
		human4.age = 45;
		human4.weight = 92.8;
		human4.goHome();
		human4.myInfoView();

		Human4 human5 = new Human4();
		human5.name = "콩쥐";
		human5.age = 26;
		human5.weight = 63;
		human5.goHome();
		human5.myInfoView();

	}

}
