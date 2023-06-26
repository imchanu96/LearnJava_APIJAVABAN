package ezen.three;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String title = ""; // 제목
		String author = ""; // 지은이
		String publisher = ""; // 출판사
		int price = 0; // 가격
		String publicationDate = ""; // 출판날짜

		BookVO book = new BookVO();

		title = "7년 후"; // 제목
		author = "기욤 뮈소"; // 지은이
		publisher = "밝은 세상"; // 출판사
		price = 12150; // 가격
		publicationDate = "2012.12.27"; // 출판날짜
		//할당
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setPrice(price);
		book.setPublicationDate(publicationDate);
		//출력
//		System.out.println("책 제목 :" + book.getTitle());
//		System.out.println("지은이 :" + book.getAuthor());
//		System.out.println("출판사 :" + book.getPublisher());
//		System.out.println("가격 :" + book.getPrice());
//		System.out.println("출판일 :" + book.getPublicationDate());
//		System.out.println("");
		
		System.out.println(book.toString());

		BookVO book2 = new BookVO();

		title = "상대적이며 절대적인 지식의 백과사전 "; // 제목
		author = "베르나르 베르베르"; // 지은이
		publisher = "열린책들"; // 출판사
		price = 19800; // 가격
		publicationDate = "2021.11.10"; // 출판날짜
		//할당
		book2.setTitle(title);
		book2.setAuthor(author);
		book2.setPublisher(publisher);
		book2.setPrice(price);
		book2.setPublicationDate(publicationDate);
		//출력
//		System.out.println("책 제목 :" + book2.getTitle());
//		System.out.println("지은이 :" + book2.getAuthor());
//		System.out.println("출판사 :" + book2.getPublisher());
//		System.out.println("가격 :" + book2.getPrice());
//		System.out.println("출판일 :" + book2.getPublicationDate());
//		System.out.println("");

		System.out.println(book2.toString());
		
		BookVO book3 = new BookVO();

		title = "노인의 전쟁"; // 제목
		author = "존 스칼지"; // 지은이
		publisher = "샘터사"; // 출판사
		price = 12000; // 가격
		publicationDate = "2009.01.23"; // 출판날짜
		//할당
		book3.setTitle(title);
		book3.setAuthor(author);
		book3.setPublisher(publisher);
		book3.setPrice(price);
		book3.setPublicationDate(publicationDate);
		//출력
//		System.out.println("책 제목 :" + book3.getTitle());
//		System.out.println("지은이 :" + book3.getAuthor());
//		System.out.println("출판사 :" + book3.getPublisher());
//		System.out.println("가격 :" + book3.getPrice());
//		System.out.println("출판일 :" + book3.getPublicationDate());
		
		System.out.println(book3.toString());

		
	}

}
