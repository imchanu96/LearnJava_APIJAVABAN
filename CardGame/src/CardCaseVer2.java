

public class CardCaseVer2 extends CardCase{

	CardCaseVer2() {
		numOfCards = (Card.shapeArr.length * Card.numberArr.length)
			+ (CardVer2.specialCardColorArr.length 
				* CardVer2.specialCardShapeArr.length);
		
		cardArr = new Card[numOfCards];
		
		init();
		
	}
	
	void init() {
		int totalCnt = 0; //52장의 카드를 위한 배열 인덱스
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt] = new Card(i, n);
				totalCnt++;
			}
		}
		
//		조커 카드 등록
		for (int i = 0; i < CardVer2.specialCardColorArr.length; i++) {
			for (int n = 0; n < CardVer2.specialCardShapeArr.length; n++) {
				cardArr[totalCnt] = new CardVer2(i, n);
				totalCnt++;
			}
		}
		
	}

	

// 카드케이스의 카드 보기
	void cardCaseInSide() {
		Card otherCard = null;
		String choiceCardStr = "";
		
		for (int i = 0; i < numOfCards - 1; i++) {
			otherCard = cardArr[i];
			
			choiceCardStr = otherCard.getCard();
			
			System.out.print(choiceCardStr + ", "); // , 넣어서 가독성 높히기
			
			if ((i+1) % 13 == 0) {
				System.out.println();
			}
		}
		
		System.out.println(cardArr[cardArr.length-1].card);
	}

}
