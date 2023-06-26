package two;

public class StringMethodBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABcDefGH";
		String newStr = "";
		String subStr = "";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.substring(i, i + 1).hashCode());
//		}
		
		for (int i = 0; i < s.length(); i++) {
			subStr = s.substring(i, i + 1);
			if (s.substring(i, i + 1).hashCode() >= 97) {
				newStr = newStr + subStr.toUpperCase();
			}else if (s.substring(i, i + 1).hashCode() < 97) {
				newStr = newStr + subStr.toLowerCase();
			}
			
		}
		
		
		System.out.println(newStr);
	}

}
