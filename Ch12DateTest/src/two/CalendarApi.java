package two;

import java.util.Calendar;

public class CalendarApi {

	public void viewDate(int year, int month) {
		String week = "일\t월\t화\t수\t목\t금\t토";

		Calendar cal = Calendar.getInstance();
		

		cal.set(year, month - 1, 1);

		System.out.printf("\t\t    %d년 %d월 \n", year, month);

		System.out.println(week);
		// 시작하는 날의 요일의 int값을 가지고 있음
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		// DAY_OF_MONTH가 해당 월의 마지막 일을 알수 있음
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if ((i + dayOfWeek - 1) % 7 == 0) {
				System.out.println("\t");
			}
		}
		
		System.out.println();
		System.out.println();
	}
	
	public void viewDate(int year) {
		for (int i = 1; i <= 12; i++) {
			viewDate(year, i);
		}
		
	}
	
}
