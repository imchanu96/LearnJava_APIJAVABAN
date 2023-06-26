package ch7.polyexam.product;

public class SmartPhone extends Product {

	public SmartPhone() {
		super(370);
	}

	public void use() {
		System.out.println("핸드폰 사용중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SmartPhone";
	}
	
}
