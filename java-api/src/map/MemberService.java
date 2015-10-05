package map;
/**
 * @file_name : MemberService.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 2.
 * @story     :
 */
public interface MemberService {
	//회원가입
	public void join(String id, String pass, String name, String age, String addr);
	//로그인
	public String login(String id, String pass);
	//총회원수
	public int count();
	//아이디검색
	public Member searchById(String id);
	
	public String change(String id, String pass, String newPass);
	
	public String close(String id, String pass);

}
