
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		
	 명시적 형변환, 자동 형변환 
				 
	 묵시적 : 눈에는 보이지 않지만 어딘가에서 처리되고 있음 => 자동
		 
	 명시적 : 눈에 보임, 명확하게 표시함 => 수동
	
	 자동 형변환
	 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.
	 
	 byte -> short -> int -> long -> float -> double
	 		 char ->
	 기본형의 자동 형변환이 가능한 방향
	 
	 1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
	 2. 기본형과 참조형은 서로 형변환 할 수 없다.
	 3. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만, 
	 값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.
	*/
		
		byte a = 1;
		int b = 2;
		long c = 3;
		
		
//		a = b;			// 큰쪽에서 작은곳으로 변환 불가
//		b = c;			// 큰쪽에서 작은곳으로 변환 불가
		
		c = b;
		b = a;
		
		double d = 4.0;
		
		d = a;
		d = b;
		d = c;
		
//		c = d;    // long은 소수점이 표현되지 않는다, double은 long에 들어 가지 않는다.
		
		}

}
