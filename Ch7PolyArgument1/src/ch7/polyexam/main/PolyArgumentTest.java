package ch7.polyexam.main;

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

		Customer buyer1 = new Customer("손진원", 1000);
		Tv tv = new Tv();
		buyer1.buy(tv);
		System.out.println(buyer1.toString());
		System.out.println();

//////////////////////////////////////////////////////////////////////		

		Customer buyer2 = new Customer("조남용", 1000);
		Com com = new Com();

		buyer2.buy(com);
		System.out.println("현재 남은 돈은 " + buyer2.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + buyer2.bonusPoint + "점입니다");
		System.out.println();

//////////////////////////////////////////////////////////////////////

		Customer buyer3 = new Customer("임찬우", 1000);
		SmartPhone sp = new SmartPhone();
		buyer3.buy(sp);

		System.out.println("현재 남은 돈은 " + buyer3.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + buyer3.bonusPoint + "점입니다");
		System.out.println();

//////////////////////////////////////////////////////////////////////		

		Customer buyer4 = new Customer("유효준", 1000);
		Book book = new Book();
		buyer4.buy(book);

		System.out.println("현재 남은 돈은 " + buyer4.money + "만원입니다");
		System.out.println("현재 보너스 점수는 " + buyer4.bonusPoint + "점입니다");
		System.out.println();

	}

}
