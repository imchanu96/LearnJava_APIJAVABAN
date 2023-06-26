package ch7.polyexam.product;

public class Book extends Product{

	public Book() {
		super(371);
	}
	
	public String use() {
		String use = "책을 읽는 중";
		return use;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book";
	}
	
	

}
