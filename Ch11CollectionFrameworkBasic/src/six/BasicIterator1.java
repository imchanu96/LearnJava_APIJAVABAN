package six;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * @Iterator?
		 * 컬렉션 프레임워크에서 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다.
		 * 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 Iterator 인터페이스를 정의하였다.
		 * 
		 * 주로 while문에 사용해서 컬렉션 클래스의 요소들을 읽어 올 수 있다.
		 * 
		 * boolean hasNext()	읽어 올 요소가 남아있는지 확인한다.
		 * 						있다면 true, 없다면 false
		 * Object next()		다음 요소를 읽어온다.
		 * 등이 있다.
		 * 
		 * 단 방향으로만 접근이 가능한 특징이 있다.
		 * 중간에 멈출수 있다.
		 */
		
		List<String> strList = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			strList.add(i + "");
		}
		
		Iterator<String> it = strList.iterator();
		
		String tempStr = "";
		while (it.hasNext() == true) {  // hasNext()는 boolean 타입으로 값의 유무만 표현
			tempStr = it.next(); // next로 값을 반환 한다.
			
			System.out.println(tempStr);
		}
	}

}
