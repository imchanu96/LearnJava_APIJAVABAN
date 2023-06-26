package ch7.polyexam.product;

public class Com extends Product {

	public Com() {
		super(300);
	}
	
	public void use() {
		System.out.println("컴퓨터 사용중");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
	
	
}
