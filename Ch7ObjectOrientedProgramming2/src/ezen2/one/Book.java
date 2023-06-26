package ezen2.one;

public class Book extends Product{

	public Book() {
		super(371);
	}
	
	public void use() {
		System.out.println("책을 읽는 중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book";
	}
	
	

}
