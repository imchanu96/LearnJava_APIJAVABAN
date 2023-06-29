package one;

import java.util.Date;

public class TestDate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		출력형태:
//	         
//		2023년 12월
//		      
//		3일 일요일
//		4일 월요일
//		,
//		,
//		10일 토요일
		Date date = new Date();

		date.setMonth(11);
		date.setDate(3);

		int day = 0;
		String dayStr = "";

		

		System.out.println(date.getYear() + 1900 + "년 " 
		+ (date.getMonth() + 1) + "월");

		for (int i = 3; i <= 9; i++) {
			date.setDate(i);
			switch (day) {
			case 0:
				dayStr = "일요일";
				break;
			case 1:
				dayStr = "월요일";
				break;
			case 2:
				dayStr = "화요일";
				break;
			case 3:
				dayStr = "수요일";
				break;
			case 4:
				dayStr = "목요일";
				break;
			case 5:
				dayStr = "금요일";
				break;
			case 6:
				dayStr = "토요일";
				break;
			}
			if (day < 6) {
				day++;
			}else if (day == 6) {
				day = 0;
			}
			
			
			System.out.println(date.getDate() + "일 " + dayStr);
			
		}
		
		

	}

}
