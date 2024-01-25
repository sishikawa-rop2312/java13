package java13.renshu;

public class Main {
	public static void main(String[] args) {
		Wand wand = new Wand();
		Wizard wizard = new Wizard();
		wizard.setWand(wand);
		Hero h = new Hero();
		wizard.heal(h);
	}
}
