package lunch;

public class Lunch {
	protected String menu1, menu2, menu3, menu4, menu5, menu6;
	protected int random = (int) (Math.random() * 6 + 1);

	public String getMenu1() {
		return menu1;
	}

	public String getMenu2() {
		return menu2;
	}

	public String getMenu3() {
		return menu3;
	}

	public String getMenu4() {
		return menu4;
	}

	public String getMenu5() {
		return menu5;
	}

	public String getMenu6() {
		return menu6;
	}

	public void setMenu1(String menu1) {
		this.menu1 = menu1;
	}

	public void setMenu2(String menu2) {
		this.menu2 = menu2;
	}

	public void setMenu3(String menu3) {
		this.menu3 = menu3;
	}

	public void setMenu4(String menu4) {
		this.menu4 = menu4;
	}

	public void setMenu5(String menu5) {
		this.menu5 = menu5;
	}

	public void setMenu6(String menu6) {
		this.menu6 = menu6;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "Lunch [메뉴1=" + menu1 + ", 메뉴2=" + menu2 + ", 메뉴3=" + menu3 + ", 메뉴4=" + menu4 + ", 메뉴5=" + menu5
				+ ", 메뉴6=" + menu6 + "]";
	}
}
