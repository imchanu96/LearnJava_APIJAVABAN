package ch7.polyexam.customer;

import ch7.polyexam.product.Product;

public class Customer { // 물건 사는 사람

	public int money = 0; // 소유금액
	public int bonusPoint = 0;
	public String customerName = "";
	public String productName = "";

	public Customer(String a, int b) {
		this.customerName = a;
		this.money = b;
	}
	
	public void buy(Product product) {

		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}

		money = money - product.price;
		bonusPoint = bonusPoint + product.bonusPoint;

		String resultStr = "";
		resultStr = product.toString();
		resultStr = resultStr + "을/를 구입하였습니다.";

		System.out.println(resultStr);
	}

	@Override
		public String toString() {
			// TODO Auto-generated method stub
		String str = "";
		str = "현재 남은 돈은 " + money + "만원입니다" + "\n"
		+ "현재 보너스 점수는 " + bonusPoint + "점입니다";
			return str;
		}
	
}
