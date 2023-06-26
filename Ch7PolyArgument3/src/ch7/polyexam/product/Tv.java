package ch7.polyexam.product;

public class Tv extends Product {

	public Tv() {
		super(100);
	}

	public void use() {
		System.out.println("tv 시청중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tv";
	}
	
	
}
