package ezen.eight;

/*
 기본형 매개변수와 참조형 매개변수
 
 
 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다(read & white)
 
 기본형은 값이 복사
 참조형은 인스턴스의 주소가 복사
 
 call by value vs call by reference
 
 
 
 
 */



public class PrimitiveParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimitiveParamEx ppe = new PrimitiveParamEx();
		
		int num = 10;
		
		System.out.println("change() 전 num: " + num);
		
		ppe.change(num);
		System.out.println("change() 끝나고 난 후 num: " + num);
	}

}
