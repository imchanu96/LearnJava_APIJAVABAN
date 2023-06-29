package one;

import java.util.ArrayList;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrayList = new ArrayList();
		for (int i = 0; i < 10; i++) { // 초기값 넣어줌
			arrayList.add((i + 1) * 10);
		}

		System.out.println("초기 값");
		System.out.println(arrayList); //출력 
		
		System.out.println();
		int firstArrayListLength = arrayList.size(); // 처음 arrayList의 길이 저장
		try { // 다 지웠을때 arrayList가 없으니 오류 발생
			for (int i = 0; i <= firstArrayListLength; i++) { // 초기 길이 만큼 for문 수행
				arrayList.remove(arrayList.indexOf((i + 1) * 10)); // indexOf()로 특정 값 위치 찾아서 지움
				System.out.println("============" + ((i + 1) * 10) + "지움" + "============");

				System.out.println(arrayList);
				System.out.println(" ");

			}
		} catch (Exception e) { // 오류 발생시 출력 문
			System.out.println("다지움");
			System.out.println("arrayList는 없다.");
		}

	}

}
