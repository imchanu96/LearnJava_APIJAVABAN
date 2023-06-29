package two;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      arrayList를 무조건 써야한다
	      
//      구구단의 2단에 대한 결과를 list에 저장하시오
//      
//      그 숫자들에 대해 + 100을 한 값을 출력하시오
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) { // 초기값 저장
			list.add((i + 1) * 2);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("2 * " + (i + 1) + " = " + list.get(i));
		}
		System.out.println("100을 더한 값");
		
		for (int i = 0; i < list.size(); i++) { // 그냥 출력값만 변환해서 출력
			System.out.println("2 * " + (i + 1) 
					+ " = " + (list.get(i) + 100));
		}
		
		for (int i = 0; i < 9; i++) { // 값 변경
			list.set(i, (list.get(i) + 100));
		}
		System.out.println("set사용해서 값을 변경");
		
		for (int i = 0; i < list.size(); i++) { // 값 출력
			System.out.println("2 * " + (i + 1) 
					+ " = " + (list.get(i)));
		}
		
	}

}
