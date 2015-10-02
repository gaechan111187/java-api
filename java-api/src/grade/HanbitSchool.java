package grade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while(true){
			System.out.println("1:성적등록, 2.학적부 리스트보기, 3번 학번으로 검색, 4번 이름으로 검색 ,5번 1등부터 성적순위 출력, 6번 이름순출력 7:종료 8:성적순2 9:이름순2");
			
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
			case 5:
//				Vector<Grade> tot = service.descGradeByTotal();
//				for (int i = 0; i < tot.size(); i++) {
//					System.out.println(tot.get(i).getTotal());
//				}
				System.out.println(service.getList());
				
				break;
			case 6:
				ArrayList<Grade> nam = service.ascGradeByName();
				for (int i = 0; i < nam.size(); i++) {
					System.out.println(nam.get(i).getName()+nam.get(i).getTotal());
				}
			
				break;
			case 8:service.dscGrade();
			System.out.println(service.getList());
			break;
			case 9:service.ascGrade();
			System.out.println(service.getList());
			break;
			case 7:return; 
			default:break;
			
			}
		}
	}

}
