
public class CardTest {

	public static void main(String[] args) {

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "heart";
		c1.num = 7;

		Card c2 = new Card();
		c2.kind = "spade";
		c2.num = 4;

		System.out.println("c1은 " + c1.kind + c1.num + "이며, " 
		+
		"크기는 " + c1.width + ", " + c1.height);
		System.out.println("c2은 " + c2.kind + c2.num + "이며, " 
		+ "크기는 " + c2.width + ", " + c2.height);

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경");
//		width, height는 Card 클래스에서 static 변수로 설정했기때문에 모든 객체가 같이 변경 된다.
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + c1.num + "이며, " 
		+ "크기는 " + c1.width + ", " + c1.height);
		System.out.println("c2은 " + c2.kind + c2.num + "이며, " 
		+ "크기는 " + c2.width + ", " + c2.height);
	}

}
