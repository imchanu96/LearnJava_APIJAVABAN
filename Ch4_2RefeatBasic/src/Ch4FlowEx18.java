
public class Ch4FlowEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 continue문
		 반복문 내에서만 사용가능
		 반복이 진행되는 도중에 continue문을 만나면
		 반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
		 */
		
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i + "\t");
		}
	}
}
