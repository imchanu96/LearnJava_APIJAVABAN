package one;

public class ErBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 예외처리(Exception handling)
	 * 
	 * 
	 * @프로그램 오류
	 * 프로그램이 실행 중 어떤 원인에 위해서 오작동을 하거나 비정상적으로 종료되는 경우가 있다.
	 * 
	 * 이러한 결과를 초래하는 원인를 프로그램 에러 또는 오류라고 한다.
	 * 발생시점에 따라 '컴파일 에러'(compile-time error)와 '런타임 에러'(runtime error)로
	 * 나눌 수 있다.
	 * 
	 * 글자 그대로의 의미이며 이 외에도 '논리적 에러'(logical error)가 있는데
	 * 컴파일도 잘되고 실행도 잘 되지만 의도한 것과 다르게 동작하는 것을 말한다.
	 * 
	 * 예를 들어: 재고가 음수가 된다던가, 게임 프로그램에서 비행기가 총알을 맞아도
	 * 죽지 않는 경우가 이에 해당한다.
	 * 
	 * 컴파일 에러 - 컴파일 시에 발생하는 에러
	 * 런타임 에러 - 실행 시에 발생하는 에러
	 * 논리적 에러 - 실행은 되지만, 의도와 다르게 동작하는 것
	 * 
	 * 컴파일러가 알려준 에러들은 모두 수정해서 컴파일을 성공적으로 마치고 나면
	 * 클래스 파일(*.class)가 생성되고, 생성된 클래스 파일을 실행할 수 있게 된다.
	 * 
	 * 하지만, 컴파일을 에러없이 성공적으로 마쳤다고 해서 프로그램의 실행 시에도 에러가
	 * 발생하지 않는 것은 아니다.
	 * 
	 * 실행도중에 발생할 수 있는 잠재적인 오류까지 검사할 수 없기 때문에 비정상적으로 종료될 수 있다.
	 * 
	 * ----
	 * 런타임 에러를 방지하기 위해서는 프로그램의 실행도중 발생할 수 있는 모든 경우의 수를 고려하여
	 * 이에 대한 대비를 하는 것이 필요하다.
	 *  
	 * 자바에서 실행 시(runtime) 발생할 수 있는 프로그램 오류를 에러와 예외,
	 * 두 가지로 구분한다.
	 * 
	 * 에러(Error)는 메모리 부족(OutOfMemoryError)이나 
	 * 스택오버플로우(StackOverflowError)와 같이 일단 발생하면 복구할 수 없는 심각한 오류이고,
	 * 예외(Exception)는 발생하더라도 수습될 수 있는 비교적 덜 심각한 것이다.
	 * 
	 * 에러가 발생하면, 프로그램의 비정상적인 종료를 막을 길이 없지만,
	 * 예외는 발생하더라도 프로그래머가 이에 대한 적절한 코드를 미리 작성해 놓음으로써
	 * 프로그램의 비정상적인 종료를 막을 수 있다.
	 * 
	 * 에러(Error) - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
	 * 예외(Exception) - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
	 * 
	 * 
	 * 
	 * @예외 클래스의 계층구조
	 * 						Object
	 * 
	 * 						Throwable
	 * 
	 * Exception										Error
	 * 
	 * IOException			RuntimeException			OutOfMemoryError
	 * 
	 * 						ArithmeticException
	 */

		
		
	}

}
