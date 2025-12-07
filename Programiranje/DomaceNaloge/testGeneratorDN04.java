public class testGeneratorDN04 {

	public static void main(String[] args) {
		int stSpola = (int) (Math.random() * 10) + 1;
		int stevilka = (int) (Math.random() * 19) + 2;
		System.out.println(stSpola + " " + stevilka);
		for (int i = 0; i < stSpola; i++) {
			System.out.println((int)(Math.random() * 10) + 1);
		}
	}
}
