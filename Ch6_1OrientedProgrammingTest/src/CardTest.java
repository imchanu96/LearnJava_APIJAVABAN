
public class CardTest {

	public static void main(String[] args) {

		
		/*
		
		2개의 카드를 만든다.
		
		하나는 이젠아카데미 교육용 카드
		
		하나는 자신이 임의로 만든 카드명 짓는다.
		
		제조사는 본인이 생각한 이름으로 저장한다.
		나머지 값은 자유
		
		 출력형태
		 카드1 크기, 높이, 모양숫자
		 카드명
		 제조사명
		 
		 출력형태
		 카드2 크기, 높이, 모양숫자
		 카드명
		 제조사명
		
		*/
		
		Card.width = 100;
		Card.height = 250;
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "♥";
		c1.num = 10;
		c1.name = "이젠아카데미 교육용 카드";
		
		c2.kind = "♣";
		c2.num = 2;
		c2.name = "클로버 2 카드";
		
		Card.make = "임찬우";
		
		System.out.println("카드1 크기, 높이  : " + Card.width + ", " + Card.height);
		System.out.println( "모양 숫자 : " + c1.kind + c1.num);
		System.out.println("카드명 : " + c1.name);
		System.out.println("제조사 : " + Card.make + "\n");
		
		System.out.println("카드2 크기, 높이  : " + Card.width + ", " + Card.height);
		System.out.println( "모양 숫자 : " + c2.kind + c2.num);
		System.out.println("카드명 : " + c2.name);
		System.out.println("제조사 : " + Card.make);
	}

}
