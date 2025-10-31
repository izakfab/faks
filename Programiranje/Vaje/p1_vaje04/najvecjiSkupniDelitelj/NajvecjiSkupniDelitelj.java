import java.util.Scanner;

public class NajvecjiSkupniDelitelj {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Long n = s.nextLong();
		Long g = s.nextLong();
		Long x = g;
		while (x <= n) {
			for (Long i = x; i <= n; x += g) {
				System.out.printf("%d %d", x, i);
			}
			x += g;
		}
	}


	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
