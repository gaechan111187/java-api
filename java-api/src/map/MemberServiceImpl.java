package map;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();

	@Override
	public void join(String id, String pass, String name, String age, String addr) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
		
		map.put(id, member);
	}

	@Override
	public String login(String id, String pass) {
		System.out.println(id+"입장");
		System.out.println(pass+"비번");
		String result = "";
		/**
		 * 환영합니다. 서울에 사시는 30세 홍길동님
		 * 비번이 다릅니다. 다시 입력하세요
		 * 입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.
		 * Map 에서 벨류값만 가져오는 메소드는map.get("키값")
		 */
		if (map.containsKey(id)) {// 맵에 키값으로 검색 ID가 있다면
			System.out.println("키값있음");
			Member temp = new Member();
			temp = (Member) map.get(id); // 왜? map에서 value가 Object이기때문
			if (temp.getPass().equals(pass)) {
				result = "환영합니다."+temp.getAddr()+"에 사시는 "+temp.getAge()+"세 "+temp.getName()+"님";	
			}
			else{
				result = "비번이 다릅니다. 다시입력하세요";
			}
		} 
		else {
			result = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.";
		}
		return result;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member searchById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
