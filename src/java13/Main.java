package java13;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		
		hero.setName("田中");
		
		hero.setHp(-100);
		
		System.out.println(hero.getName() + "のHP:" + hero.getHp());
	}
}
