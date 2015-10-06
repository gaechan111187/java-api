package calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @file_name : CalendarMain.java
 * @author : chanhok61@daum.net
 * @date : 2015. 10. 6.
 * @story : Calendar 클래스
 */
public class CalendarMain {
	/**
	 * 특정일 (2015-09-14)로 부터 오늘까지 일수 구하기 2016-02-05에서 오늘날짜까지 남은 일수 구하기 (D-18)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DayCounter count = new DayCounter();
		
		System.out.println("날짜를 입력하세요");
		String date = scanner.next();
		count.DayCounter(date);
		System.out.println(count.DayCounter(date));
	}
}

class DayCounter {
	Calendar startDay = Calendar.getInstance(); // 스태틱메소드
	Calendar today = Calendar.getInstance();
	
	public String DayCounter(String date){
		if (today.getTimeInMillis()>startDay.getTimeInMillis()) {
			return "오늘보다 과거입니다.";
		}
			
		
	String year = "", month = "", date1 = "";
	StringTokenizer tok = new StringTokenizer(date, "-");
	year = tok.nextToken();
	month = tok.nextToken();
	date1 = tok.nextToken();

	int year1 = Integer.parseInt(year), month1 = Integer.parseInt(month), date2 = Integer.parseInt(date1);
	startDay.set(year1, month1 - 1, date2); // 실제값보다 월이 1이 작다.
	startDay.getTimeInMillis(); // 특정일에 해당하는 int값을 가져올(1970.01.01 부터
										// 누적된 초단위)
	int workDays = (int) Math.ceil(startDay.getTimeInMillis() - today.getTimeInMillis())
			/ (24 * 60 * 60 * 1000);
	return "D-"+workDays+"일";
	}

}