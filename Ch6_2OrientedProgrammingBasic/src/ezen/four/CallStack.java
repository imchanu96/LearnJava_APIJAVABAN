package ezen.four;

public class CallStack {

	/*
	JVM 메모리 구조
	
	메서드(Method) 영역
	프로그램 실행 중 어떤 클래스가 사용되면 JVM은 해당 클래스의 클래스파일(*.class)을
	읽어서 분석하여 클래스에 대한 정보(클래스 데이터)를 이곳에 저장한다.
	이때 그 클래스의 스태틱 변수도 이 영역에 함께 생성된다.
	
	2.힙(heap)영역
	인스턴스가 생성되는 공간
	프로그램 실행중 생성되는 인스턴스는 모두 이곳에 생성된다.
	인스턴스 변수들이 생성되는 공간이다.
	
	3. 호출스택(call stack) -> stack area
	호출 스택은 메서드의 작업에 필요한 메모리 공간을 제공한다.
	메서드가 호출되면 호출 스택에 호출된 메서드를 위한 메모리가 할당되면
	이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과
	연산의 중간결과 등을 저장하는데 사용된다.
	그리고 메서드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워진다.
	
	스택의 특징
	- 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
	- 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
	- 스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
	- 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
	
	
		static 영역(클래스, 메서드)				heap 영역					stack 영역
	|								|new를 하면 생성				|	지역(local)적이다.	|
	|								|반영구적으로 소멸되지 않음		|					|
	|								|						|					|
	|								|						|					|
	|								|						|					|
	|	프로그램종료시 소멸				|null또는 가비지컬렉터로 		|					|
	|								|일정주기가 지나면 소멸			|					|					|
	|
	
	*/
	
	
	
}
