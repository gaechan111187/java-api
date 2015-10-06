package lunch;

import java.util.ArrayList;

public class LunchChoiceImpl implements LunchChoice {
	ArrayList<Lunch> vec = new ArrayList<Lunch>();
	public void menu() {
		Lunch menu = new Lunch();
		menu.setMenu1("칼국수");
		menu.setMenu2("맥도날드");
		menu.setMenu3("뷔패");
		menu.setMenu4("부대찌개");
		menu.setMenu5("김밥천국");
		menu.setMenu6("제육볶음");
		vec.add(menu);
		
	}

	@Override
	public ArrayList<Lunch> getList() {
		return vec;
	}

}
