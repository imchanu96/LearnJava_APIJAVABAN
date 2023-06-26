package one.ezen;

public class EzenStudent implements Student {
	String name = "";
	
	@Override
	public void setAge(int age) {
		//오류? interface에서 final로 정의 했기에 변할수 없는 
		//최종값으로 의미 없는 행동으로 오류이다.
//		this.age = age;
		System.out.println("나이 설정하는 메서드 실행");
	}
	
	@Override
	public int getAge() {
	
		return age;
	}
	
	@Override
	public void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
