package java13.notion;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setHp(-50);
		System.out.println(h.getName() + "のHP:" + h.getHp());
	}
}