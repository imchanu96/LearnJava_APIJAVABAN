package ezen.tennine;

public class ShoppingMallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Buyer buyer1 = new Buyer();
		
		Tv tv = new Tv();
		
		buyer1.buyTv(tv);
		
		System.out.println("현재 남은 돈은 " + buyer1.money + "원입니다.");
		System.out.println("현재 보너스 점수는 " 
		+ buyer1.bonusPoint + "점입니다.");
	}

}
