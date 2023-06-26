package ch7.polyexam.main;

import java.util.Scanner;

import ch7.polyexam.customer.Customer;
import ch7.polyexam.product.Book;
import ch7.polyexam.product.Com;
import ch7.polyexam.product.SmartPhone;
import ch7.polyexam.product.Tv;

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		사람은 tv구매가가능하다
//		사람은 com구매가가능하다
//		com은 200원이다
//		사람은 책도 구매가가능하다
//		책은 30원이다
//		사람은 3사람 존재한다
//		각각 한사람은 tv
//		다른사람은 com
//		다른사람은 책을 구매한다
//		사람에게는 이름이 존재한다
//		서로다른 소지금액을 부여하시오

		String customerChoose = "";

		Customer buyer1 = new Customer("임찬우", 1000);
		Book book = new Book();
		Com com = new Com();
		SmartPhone sp = new SmartPhone();
		Tv tv = new Tv();

		System.out.println("구매할 물건의 번호를 입력하세요");
		System.out.println("1번 tv");
		System.out.println("2번 컴퓨터");
		System.out.println("3번 스마트폰");
		System.out.println("책");
		Scanner scan = new Scanner(System.in);

		customerChoose = scan.nextLine();

		if (customerChoose.equals("1")) {  // Tv를 선택했을때
			buyer1.buy(tv);
			System.out.println(buyer1.toString());
			System.out.println();
			System.out.println(tv.use());
		}else if (customerChoose.equals("2")) { // 컴퓨터를 선택했을때
			buyer1.buy(com);
			System.out.println(buyer1.toString());
			System.out.println();
			System.out.println(com.use());
		}else if (customerChoose.equals("3")) { // 스마트폰을 선택했을때
			buyer1.buy(sp);
			System.out.println(buyer1.toString());
			System.out.println();
			System.out.println(sp.use());
		}else if (customerChoose.equals("4")) { // 책을 선택했을때
			buyer1.buy(book);
			System.out.println(buyer1.toString());
			System.out.println();
			System.out.println(book.use());
		}else {
			System.out.println("다시 입력하세요.");
		}

		scan.close();
	}

}
