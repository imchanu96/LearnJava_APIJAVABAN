package two;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String passwordOriginStr = "qwer1234"; // 기준
		String passwordChangeStr = ""; // 결과

		//위치별로 * 처리
		for (int i = 0; i < passwordOriginStr.length(); i++) {
			if (i < passwordOriginStr.length()) {
				passwordChangeStr = passwordChangeStr + "\n"
						+ passwordOriginStr.replace(passwordOriginStr.substring(i, i + 1)
								, "*");
			} else {
				passwordChangeStr = passwordChangeStr + "\n"
						+ passwordOriginStr.replace(passwordOriginStr.substring(i - 1, i)
								, "*");
			}

		}

	      for (int i = 0; i < passwordOriginStr.length(); i++) {
	    	  passwordChangeStr += "*";
	      }

		// ---- 출력결과는 건드리지 않는다. ----
		System.out.println(passwordOriginStr);
		System.out.println(passwordChangeStr);

	}

}
