package one;

import java.util.Date;

public class BasicDate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 날짜 관련 클래스
		 * 
		 * Date 클래스
		 * 
		 * 날짜와 시간을 다룰 목적으로 만들어진 클래스이다.
		 * 
		 * 단, 더 보완된 클래스나 인터페이스가 만들어져있지만 기본은 같다.
		 */
//		호환성
		Date calendar = new Date();

		System.out.println(calendar);

//		format -> 보여지는 형태
//		format이 중요하다. format을 통해 다룰줄 알아야 한다.

		int year = 0;
		int month = 0;
		int date = 0;
		int day = 0;

		// 메서드에 줄 그어져있는 메서드는
		// @Deprecated == 침체된, 더이상 쓰지마라, 지원 안한다.
		year = calendar.getYear();  
		month = calendar.getMonth();
		date = calendar.getDate();
		day = calendar.getDay();
		
		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + date);
		System.out.println("요일 : " + day);
		
		System.out.println("올바른 사용 예");
		
		System.out.println("년 : " + (year + 1900));
		System.out.println("월 : " + (month + 1));
		System.out.println("일 : " + date);
		System.out.println("요일 : " + day);

		if (day == 5) {
			System.out.println("요일 : " + "금");
		}
		
		Date d = new Date();
//		6월 1일
		d.setMonth(5);
		d.setDate(1);
		
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
		System.out.println("일요일 : " + d.getDay());
		
//		4월 1일
		d.setMonth(3);
		d.setDate(1);
		
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
		System.out.println("토요일 : " + d.getDay());
		
	/*
	 * 요일
	 * 일 월 . . . 토
	 * 0 1 . . . 6
	 * 
	 * 달
	 * 1월 2월 . . . 12월
	 * 0, 1, . . . 11
	 * 
	 * 년대
	 * 2000이상을 표현하려면 1900을 더해라
	 */
	}

}
