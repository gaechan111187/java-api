package lunch;

import java.util.ArrayList;

/**
 * @file_name : LunchChoice.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 6.
 * @story     : 점심메뉴고르기
 */
public interface LunchChoice {
	public ArrayList<Lunch> getList(); // 메뉴 전체 리스트 가져오기
	public String random(); // 메뉴 랜덤매칭
	

}
