package lunch;

import java.util.Scanner;

public class RandomLunch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LunchChoice choice = new LunchChoiceImpl();
		System.out.println("랜덤 오늘의 점심");
		System.out.println(choice.getList());
		System.out.println("아무거나 누르세요");
		String key = scanner.next();
		System.out.println("오늘의 메뉴는 "+choice.random()+"입니다.");
		
	}
}
