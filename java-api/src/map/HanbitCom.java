package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요".substring(0,2);  0이상 2미만
	 * "안녕"   (1,3)은 "녕하"
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService service = new MemberServiceImpl();
		while (true) {
			System.out.println("1:회원가입 2:로그인 3:총회원수 4:ID검색 5.종료");
			
			switch (scanner.nextInt()) {
			case 1:
				
				System.out.println("아이디 입력");
				String id = scanner.next();
				System.out.println("비번 입력");
				String pass = scanner.next();
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("나이 입력");
				String age = scanner.next();
				System.out.println("주소 입력");
				String addr = scanner.next();
				service.join(id, pass, name, age, addr);
				System.out.println("반갑습니다."+name+"님");
				break;
			case 2:
				System.out.println("아이디 입력");
				String idck = scanner.next();
				System.out.println("비번 입력");
				String passck = scanner.next();
				System.out.println(service.login(idck, passck));
//				String flag = result.substring(0, 2);
//				switch (flag) {
//				case "환영":System.out.println(result);
//					break;//현실에서는 로그인 성공 페이지로 전환
//				case "비번":System.out.println(result);
//					break;// 현실에서는 로그인 페이지 다시 보여줌
//				case "입력":System.out.println(result);
//					break; // 현실에서는 회원가입 페이지 보여줌
//
//				default:
//					break;
//				}
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				return;

			default:
				break;
			}
			
		}
	}

}
