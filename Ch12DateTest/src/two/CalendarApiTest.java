package two;

public class CalendarApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////////////////////달력 만들기//////////////////////////////////////////
		
		CalendarApi ca = new CalendarApi();
		
		ca.viewDate(2022, 12);	// 특정 월 출력
		
		ca.viewDate(2023);		// 특정 년도 출력
	}

}
