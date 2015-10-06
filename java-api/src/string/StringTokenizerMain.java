package string;

import java.util.StringTokenizer;

/**
 * @file_name : StringTokenizerMain.java
 * @author : chanhok61@daum.net
 * @date : 2015. 10. 6.
 * @story : StringTokenizer
 */
public class StringTokenizerMain {
	/**
	 * StringTokenizer 은 생성자에서 String 으로 잘라내는 기능을 함
	 */
	public static void main(String[] args) {
		String date = "2015-10-06";
		StringTokenizer tok = new StringTokenizer(date, "-");
		System.out.println("토큰의 갯수" + tok.countTokens());
		System.out.println("-를 제외한 출력문");
		while (tok.hasMoreElements()) { 
			// Elements는 배열의 요소를 뜻하며 char 요소가 있을때까지 ->끝까지
			String token = tok.nextToken();
			System.out.print(token + "\t");
		}
	}
}
