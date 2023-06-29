package six;

import java.util.HashMap;
import java.util.Scanner;

public class TestMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		우리반 중에서 4명의 이름을 키로 구성하고
//	      
//	      그 사람들의 별명(value)을 작성하시오
//	      
//	      키보드 입력을 통해 한사람의 별명이 출력되도록 구성하시오
		
		HashMap<String, String> studentArisMap = new HashMap<String, String>();
		
		studentArisMap.put("유효준", "나 E 아니다.");
		studentArisMap.put("손진원", "문제 풀었어요?");
		studentArisMap.put("조남용", "극 E");
		studentArisMap.put("임정빈", "조교");
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		
		System.out.println("이름을 입력해주세요");
		
		name = scan.nextLine();
		
		System.out.println(name + "의 별명은 " + studentArisMap.get(name));
	}

}
