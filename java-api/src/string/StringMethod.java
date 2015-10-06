package string;
/**
 * @file_name : StringMethod.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 5.
 * @story     : java.lang.String
 */
public class StringMethod {
	public static void main(String[] args) {
		System.out.println("abcde".contains("f") ? "f가 존재" : "f가 존재하지 않음");
		String str1 = "abc";
		String str2 = "abc";    // abc라는 리터럴 값이 상수풀에 존재하는지 체크
		/**
		 * str1과 str2가 같음,  str1과 str2가 다름
		 */
		System.out.println(str1==str2 ? "str1과 str2가 같음":  "str1과 str2가 다름");//삼항 연산자(str1==str2)
		System.out.println(str1.equals(str2) ? "str1과 str2가 같음": "str1과 str2가 다름");  //삼항 연산자(str1.equals(str2))
		
		
		/**
		 * == : 주소값 비교
		 * equals() : 실제값(value) 비교, 주소는 상관없고 이름만 동일한 지 체크
		 */
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4 ? "str3과 str4가 같음":  "str3과 str4가 다름");
		System.out.println(str1.equals(str2) ? "str3과 str4가 같음" : "str3과 str4가 다름");
		
		
		String str5= "abc";
		String str6 = new String("abc");
		System.out.println(str5==str6 ? "str5과 str6가 같음":  "str5과 str6가 다름");
		System.out.println(str5.equals(str6)?"str5과 str6가 같음" :"str5과 str6가 다름");
		//"Hello.txt" 는 리터럴 객체이다.
		System.out.println("Hello.txt".endsWith("txt") ? "텍스트파일입니다" : "텍스트파일이 아닙니다");  //끝의 문자를 비교
		System.out.println("헬로우".concat(",자바월드!!"));  //앞 리터럴과 붙여서 출력
		
		System.out.println("HELLO".equals("hello")? "같습니다": "다릅니다");  
		System.out.println("HELLO".equalsIgnoreCase("hello")? "같습니다": "다릅니다");  //대소문자 상관없이 비교
		System.out.println("Hello Tom".replace("Tom", "Alex")); // 콤마앞 글자를 콤마뒤 글자로 교체
		/**
		 * JDK 5 버전 이전에는 replace()  replaceAll() 이 서로 다르게 반응했으나
		 * 이후에는 서로 같은 기능(전부 체인지되는 기능) 으로 바뀌었음.
		 * 그럼 차이점은 없는가? 하면 정규식에 대한 기능이 있는가 없는가의 차이점이 있다.
		 * replace() 는 기능이 없고 replaceAll() 은 기능이 있다.
		 * 따라서 replaceAll() 을 쓰도록 권고되고 있다.
		 */
		System.out.println("[1]A B C D : A B C D".replace(" C D", " E F"));
		System.out.println("[1]A B C D : A B C D".replace(" C D", " E F"));
		/**
		 * .은 정규식에서 쓰이는데 맨 앞 한글자만 지정합니다.
		 * 그러니까 .a 는 a앞에 글자와 a까지를 뜻합니다.
		 * 아래 예제에서 replace()는 .을 정규식 표현법으로 보질 않고 리터럴의 마침표로 인식함으로
		 * 프로그래밍에서 자주 사용하는 정규식을 적용할 수 없게 됩니다.
		 * 
		 */
		System.out.println("[3] Hello Java".replace("a", ""));
		System.out.println("[4] Hello Javan".replaceAll(".a", ""));
		System.out.println("Hello. Java       ".length());    // char의 갯수
		System.out.println("Hello. Java       ".trim().length());  //문장 맨앞과 맨뒤 공백만 제거
		System.out.println("Hello. Java       ".replaceAll(" ", "").length());   // 모든 공백 제거
		System.out.println(String.valueOf(5));  //클래스(가) 메소드 호출(클래스 메소드가 호출됐다는 것은, 내부적으로 static이 생략됐다는것을 기억하자)
//		Account a = new Account();
//		a.test(); //인스턴스(가) 메소드 호출
		System.out.println(String.valueOf("ab")); // "ab"는 상수풀에 있는 주소값을 가지고 있다.
		//String.valueOf("ab")의 결과값은 값 그대로인 ab를 출력한다.
		
		/**
		 * Wrapper클래스
		 * 기본형 타입 <--> 객체형 타입
		 * byte <--> Byte
		 * short <--> Short
		 * int <--> Integer
		 * long <--> Long
		 * char <--> String
		 * boolean <--> Boolean
		 * float <--> Float
		 * double <--> Double
		 */
//		byte b=Byte.parseByte("1");
//		short s = Short.parseShort("1");
//		int i = Integer.parseInt("1");
//		long l = Long.parseLong("1");
//		boolean foo = Boolean.parseBoolean("true");
//		float f= Float.parseFloat("1.0");
//		double d= Double.parseDouble("1");
//		System.out.println(b);
		
		int a = Integer.parseInt("1");
		int b = Integer.parseInt("2");
		String age = "20";
		
		if (Integer.parseInt(age)>19) {
			System.out.println("영화관람가능");
		}
		else {
			System.out.println("불가");
		}
		
				
		
	}
}
