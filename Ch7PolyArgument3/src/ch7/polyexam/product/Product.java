package ch7.polyexam.product;

public class Product {

	public int price = 0; // 제품의 가격
	public int bonusPoint = 0; // 제품구매 시 제공하는 보너스 점수

	Product(int price) {

		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	
	public void use() {
		String use = "";

	}
}
