package two;

public class StringEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "Hello Asia.java"; // 기준
		int strCount = 0; // 결과

		// 문자열 안에 a가 몇 개 존재하는지 출력하시오

		// substring으로 문자 자르고 equals 값이 동일할시 strCount수 증가하여 계산
		for (int i = 0; i < originStr.length(); i++) {
			if (originStr.substring(i, i + 1).equals("a")) {
				strCount++;
			}
		}
		// split으로 문자 자르고 equals로 값이 동일할시 strCount수 증가하여 계산
		String arr[] = originStr.split("");

		for (int i = 0; i < originStr.length(); i++) {
			if (arr[i].equals("a")) {
				strCount++;
			}
		}
		// replace로 문자삭제 후 길이차이로 계산
		String changeStr = "";
		changeStr = originStr.replace("a", "");
		strCount = originStr.length() - changeStr.length();
		
		
		// ---- 출력결과는 건드리지 않는다. ----
		System.out.println(originStr);
		System.out.println("갯수: " + strCount);

	}

}
