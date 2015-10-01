package grade;

import java.util.Scanner;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while(true){
			System.out.println("1:성적등록, 2.학적부 리스트보기, 3번 학번으로 검색, 4번 이름으로 검색 ,5번 1등부터 성적순위 출력, 6번 이름순출력 7:종료");
			
			switch (scanner.nextInt()){
			case 1:System.out.println("성적입력시스템\n학번입력");
			String hak = scanner.next();
			System.out.println("이름입력");
			String name= scanner.next();
			System.out.println("국어점수입력");
			int kor = scanner.nextInt();
			System.out.println("영어점수입력");
			int eng = scanner.nextInt();
			System.out.println("수학점수입력");
			int math = scanner.nextInt();
			service.input(hak, name, kor, eng, math);
				break;
			case 2:System.out.println(service.getList());
			System.out.println();
				break;
			case 3:System.out.println("학번입력");
			String findHak = scanner.next();
			System.out.println(service.searchByHak(findHak));
			
				break;
			case 4:System.out.println("이름입력");
			String findName = scanner.next();
			System.out.println(service.SearchByName(findName));
				break;
			case 5:service.descGradeByTotal();
				System.out.println(service.getList());
				break;
			case 6:service.ascGradeByName();
			System.out.println(service.getList());
				break;
			case 7:return; 
			default:break;
			
			}
		}
	}

}
