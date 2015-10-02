package grade;

import java.util.ArrayList;

public interface GradeService {
	public void input(String hak, String name, int kor, int eng, int math);
	public ArrayList<Grade> getList();
	public Grade searchByHak(String hak);
	public ArrayList<Grade> SearchByName(String name);
	public ArrayList<Grade> descGradeByTotal(); // 성적을 내림차순으로 정렬
	public ArrayList<Grade> ascGradeByName();  //  성적을 이름에 따라 오름차순으로 정렬
	public void dscGrade();
	public void ascGrade();
}
