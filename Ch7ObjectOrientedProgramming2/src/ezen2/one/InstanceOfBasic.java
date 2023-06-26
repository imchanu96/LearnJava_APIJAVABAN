package ezen2.one;

public class InstanceOfBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = null;
		Product p2 = null;
		
		Book book = new Book();
		Tv tv = new Tv();
		
		p = book;
		p2 = tv;
//		true이면 형변환이 된다. => 상속관계이다.
		System.out.println(p instanceof Book);
		System.out.println(p instanceof Tv);
//		타입체크 
		if (p2 instanceof Book) {
			System.out.println("이건 책이야");
//			p.use();
			
			Book tempBook = (Book)p;
			tempBook.use();
		}else if (p2 instanceof Tv) {
			
			System.out.println("이건 Tv이야");
			Tv tempTv = (Tv)p2;
			tempTv.use();
		}else {
			System.out.println("둘다 아니야");
		}
		
//		p = book;
		

	}

}
