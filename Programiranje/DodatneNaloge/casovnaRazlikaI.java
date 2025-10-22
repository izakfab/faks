import java.util.Scanner;
public class casovnaRazlikaI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h1 = s.nextInt();
		int m1 = s.nextInt();
		int h2 = s.nextInt();
		int m2 = s.nextInt();
		System.out.println((m2 - m1 < 0 ? m2 - m1: m2 - m1) + 60 * (h2 - h1));
	}
}
