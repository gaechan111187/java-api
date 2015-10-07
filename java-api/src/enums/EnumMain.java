package enums;
import java.util.Scanner;
/**
 * @file_name : EnumMain.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 7.
 * @story     : 열거형 예제
 */
public class EnumMain {
	public static void main(String[] args) {
		/**
		 * 숫자값을 입력하면, 숫자값에 해당하는 방향이 스트링으로 나오게끔
		 * [동쪽으로 이동합니다]
		 */
		System.out.println("가고자하는 방향을 정하세요 1:동  2: 서  3: 남  4: 북");
		Scanner scanner = new Scanner(System.in);
		Navigation n = new Navigation();
		n.setDirection(scanner.nextInt());
		System.out.println(n.getDirection());
	}
}

	
	
