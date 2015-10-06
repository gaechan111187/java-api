package string;
/**
 * @file_name : StringBufferMain.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 6.
 * @story     :	StringBuffer 문법
 */
public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("java "+"progaming"); // 두개의 주소값 참조 => 비추
		System.out.println(sb.append("java").append("programing").toString()); // 결합시킨 하나의 주소값 참조
		// 체이닝기법
		System.out.println(sb.length());//실제문자수
		System.out.println(sb.capacity());//할당된 배열사이즈
		sb.replace(0, 4, "C++"); // 0이상 : 시작인덱스 포함  4 미만: 끝 인덱스는 불포함
		System.out.println(sb);
		System.out.println(sb.reverse()); //gnimargorp++C
		System.out.println(sb.reverse()); //C++programing
		System.out.println(sb.substring(11)); //11번째 인덱스부터 끝까지
		StringBuffer sb1 = new StringBuffer("홍길동");
		StringBuffer sb2 = new StringBuffer("홍길동");
		System.out.println(sb1==sb2); // 만약 String 이라면 reference 비교 -> false
		System.out.println(sb1.equals(sb2)); // String 이라면 value 비교 -> false
		/**
		 * StringBuffer 는 무조건 레퍼런스(reference 주소값) 비교만 한다.
		 */
	}

}
