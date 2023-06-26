package ezen.one;

public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		
		Child c = new Child();
		
		p.age = 10;
//		p.play();  자식클래스에 작성된 메서드이기 때문에 부모 클래스에서 호출 불가
		
		System.out.println(p.age);
		
		c.age = 100;
		c.play();
		
		System.out.println(p.age + c.age);
		
		
		
		
		
	}

}
