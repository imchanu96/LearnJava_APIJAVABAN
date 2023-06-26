package ch7.polyexam.product;

public class Com extends Product {

	public Com() {
		super(300);
	}
	
	public String use() {
		String use = "com 사용중";
		return use;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
	
	
}
