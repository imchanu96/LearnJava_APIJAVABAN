package three;

import java.util.ArrayList;

public class BasicArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
//					제너릭						Generics
//		표현식
//		리스트.add(Object obj)
		
//		list.add(123);
		
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			}else {
				System.out.print(list.get(i) + ", ");
			}
			
		}
	}

}
