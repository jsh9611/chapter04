package chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);

	}
	
	public static void printDate(Calendar cal) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		// 월
		int month = cal.get(Calendar.MONTH);
		
		// 일
		int day = cal.get(Calendar.DATE);
		
		// 요일[1(일)~7(토)]
		int date = cal.get(Calendar.DAY_OF_WEEK);
		
		// 시
		int hour = cal.get(Calendar.HOUR);
		
		// 분
		int minute = cal.get(Calendar.MINUTE);
		
		// 초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year	+ "-" +
				(month+1)	+"-" +				
				day	+ "-" +
				date + "-" +
				hour	+ "-" +
				minute	+ "-" +
				second	+ "-"
				);
	}

}
