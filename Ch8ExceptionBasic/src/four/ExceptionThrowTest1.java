package four;

public class ExceptionThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 예외 발생시키기
	 * 
	 * 키워드 throw를 사용하면 프로그래모가 고의로 예외를 발생시킬 수 있다.
	 * 
	 * 1. 먼저 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
	 * Exception e = new Exception("고의로 발생");
	 * 
	 * 2. 키워드 throw를 이용해서 예외를 발생시킨다.
	 * throw e;
	 * 
	 */
		try {
			Exception e = new Exception("왜 일부러 예외를 발생시켜?");
			throw e;
		} catch (Exception e2) {
			System.out.println("에러 메세지 : " + e2.getMessage());
			e2.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료됨");
	/*
	 * 우선순위
	 *	인터럽트로 인해 순위가 보장되지 않는다.
	 *	인터럽트(interrupt), 끼어듦, 또는 가로막기란
	 *	, 마이크로프로세서(CPU)가 프로그램을 실행하고있을 때
	 *	, 입출력하드웨어 등의 장치에 예외상황이 발생하여
	 *	처리가 필요할 경우에 마이크로프로세서에게
	 *	알려 처리할 수 있도록 하는 것을 말한다.
	 * 
	 */
		
		

	}

}
