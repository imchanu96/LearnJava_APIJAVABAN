package seven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BasicMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrNum1 = new ArrayList<Integer>();
		
		ArrayList<Integer> arrNum10 = new ArrayList<Integer>();
		
		ArrayList<Integer> arrNum100 = new ArrayList<Integer>();
		
		HashMap<String, ArrayList> equipment = new HashMap<String, ArrayList>();
	
		for (int i = 0; i <= 10; i++) {
			arrNum1.add((i + 1));
			arrNum10.add((i + 1) * 10);
			arrNum100.add((i + 1) * 100);
		}
		
//		for (int j = 0; j <= 10; j++) {
//			System.out.println("arrNum1의 " + (j + 1) + "번째" + arrNum1.get(j));
//			System.out.println("arrNum10의 " + (j + 1) + "번째" + arrNum10.get(j));
//			System.out.println("arrNum100의 " + (j + 1) + "번째" + arrNum100.get(j));
//		}
		
		equipment.put("1의 집합", arrNum1);
		equipment.put("10의 집합", arrNum10);
		equipment.put("100의 집합", arrNum100);
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		System.out.println("보고 싶은걸 넣어");
		System.out.println("1의 집합, 10의 집합, 100의 집합" );
		name = scan.nextLine();
		
		System.out.println(equipment.get(name));
	
		System.out.println("이중에 하나 골라봐");
		int pickNum = 0;
		
		pickNum = Integer.parseInt(scan.nextLine());
		System.out.println(equipment.get(name).get(pickNum));
	}

}
