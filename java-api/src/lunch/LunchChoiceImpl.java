package lunch;

import java.util.ArrayList;

public class LunchChoiceImpl implements LunchChoice {
	ArrayList<Lunch> vec = new ArrayList<Lunch>();
	Lunch menu = new Lunch();
	

	@Override
	public ArrayList<Lunch> getList() {
		
		menu.setMenu1("칼국수");
		menu.setMenu2("맥도날드");
		menu.setMenu3("뷔패");
		menu.setMenu4("부대찌개");
		menu.setMenu5("김밥천국");
		menu.setMenu6("제육볶음");
		vec.add(menu);
		return vec;
	}

	public String random() {

		String result = "";
		int key = menu.getRandom();
		//System.out.println(key);
		switch (key) {
		case 1: result = vec.get(0).getMenu1();
			break;
		case 2: result = vec.get(0).getMenu2();
			break;
		case 3: result = vec.get(0).getMenu3();
			break;
		case 4: result = vec.get(0).getMenu4();
			break;
		case 5: result = vec.get(0).getMenu5();
			break;
		case 6: result = vec.get(0).getMenu6();
			break;

		default:
			break;
		}
		return result ;
	}
}
