package four;

public class ForEachTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	숫자 3의 배수로 10번째 까지 배열에 담는다
//	      
//	이들의 값을 방금 배운 for each문으로 출력하시오
		int[] arrNum = new int[10];
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = (i + 1) * 3;
		}
		
		for (int num : arrNum) {
			System.out.println(num / 3 + "번째 : " + num);
		}
	}

}
