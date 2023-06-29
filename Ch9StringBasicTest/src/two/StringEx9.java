package two;

public class StringEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "He is a good basketball player. He can run as fast as me."; // 기준
//	      as갯수
		int strCount = 0; // 결과

//	            문자열 안에 as가 몇 개 존재하는지 출력하시오
		// 진짜 as만 찾을 경우
//	      String[] strArr = originStr.split(" ");
//	      for (int i = 0; i < strArr.length; i++) {
//			if (strArr[i].equals("as")) {
//				strCount++;
//			}
//		}
		//바뀐 길이만큼 계산
		String findStr = "as";
		String changeStr = originStr.replace(findStr, "");
		strCount = (originStr.length() - changeStr.length()) / findStr.length();

		// 문자가 'a'이고 's'일경우 strCount가 증가한다.
		for (int i = 0; i < originStr.length(); i++) {
			if (originStr.indexOf(i) == 'a' 
					&& originStr.indexOf(i + 1) == 's') {
				strCount++;
			}
		}
		
		
		// ---- 출력결과는 건드리지 않는다. ----
		System.out.println(originStr);
		System.out.println(strCount);
	}

}
