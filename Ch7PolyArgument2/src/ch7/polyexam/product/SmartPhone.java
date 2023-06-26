package ch7.polyexam.product;

public class SmartPhone extends Product {

	public SmartPhone() {
		super(370);
	}

	public String use() {
		String use = "폰 사용 중";
		return use;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SmartPhone";
	}
	
}
