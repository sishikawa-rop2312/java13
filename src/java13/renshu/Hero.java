package java13.renshu;

public class Hero {
	private String name;
	private int hp;

	public String getName() {
		return this.name + "さん";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}
}
