package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : SimpleDateFormatMain.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 6.
 * @story     : SimpleDateFormat 문법
 */
public class SimpleDateFormatMain {
	public static void main(String[] args) {
		Date today = new Date();  //Ctrl +Shift +o
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5, sdf6;
		sdf1 = new SimpleDateFormat();  //15. 10. 6 오후 4:30
		sdf2 = new SimpleDateFormat("yyyy-MM-dd");  //2015-10-06
		sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");  //2015년 10월 06일 화요일
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //2015-10-06 16:30:23
		sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a"); //2015-10-06 16:30:23 오후
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
	}
}
