package nine;

import java.util.HashMap;
import java.util.Map;

public class BasicMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map userMap = new HashMap<String, String>();
		
		userMap.put("psu", "qwer");
		userMap.put("lkj", "asdf");
		userMap.put("lhs", "zxcv");
		
		
		System.out.println("id와 password를 입력해주세요");
		String id = "psu";
		String pwd = " qwer".trim();
		
		System.out.println();
		
//		String checkIdStr = "";
		
		if (userMap.get(id).equals(pwd) == true) {
			System.out.println("비밀번호가 일치합니다.");
			System.out.println("로그인 되었습니다.");
			
			System.out.println("반갑습니다. " + id + "님");
		}else {
			System.out.println("id 또는 비밀번호가 틀렸습니다.");
		}
	}

}
