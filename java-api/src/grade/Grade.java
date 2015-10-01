package grade;
/**
 * @file_name : Grade.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 1.
 * @story     : 성적표 관리 객체 클래스
 */
public class Grade {
	private int kor, eng, math;
	private String hak,name; //학번은 유일한 ID값
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getHak() {
		return hak;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal(){
		int total = kor+eng+math;
		//로직완성
		return total;
	}
	@Override
	public String toString() {
		return "[학번 : "+hak+", 이름 :"+name+", 총점 : "+this.getTotal()+"]";
	}
	
}
