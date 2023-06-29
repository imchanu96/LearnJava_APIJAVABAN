package three;

import java.util.ArrayList;

public class BasicArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
//					제너릭						Generics
//		표현식
//		리스트.add(Object obj)
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		Integer intNum = 4;
		list.add(intNum);
		
		int num = 5;
		list.add(num);
		
		Integer intNum2 = new Integer(6);
		list.add(intNum2);
		
		
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			}else {
				System.out.print(list.get(i) + ", ");
			}

		}
		list.set(0, 100);
		list.set(3, -44);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			}else {
				System.out.print(list.get(i) + ", ");
			}

		}
	}

}
