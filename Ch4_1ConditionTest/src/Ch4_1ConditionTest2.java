
public class Ch4_1ConditionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		성적 처리 프로그램

//		ctrl + shift + f : 자동 정렬

		int num = 89;

		System.out.println(num);

		if (num <= 100 && num >= 90) {
			System.out.println("A등급입니다.");
		} else if (num <= 89 && num >= 80) {
			System.out.println("B등급입니다.");
		} else if (num <= 79 && num >= 70) {
			System.out.println("C등급입니다.");
		} else if (num <= 69)
			System.out.println("F등급입니다.");

	}

}
