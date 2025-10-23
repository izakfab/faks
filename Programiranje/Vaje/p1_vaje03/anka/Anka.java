import java.util.Scanner;

public class Anka {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int d = s.nextInt();
		for (int i = 1; i < 10; i += 2)
			for (int j = m + 1; j < 10; j++)
				for (int k = 0; k < 10; k += d)
					System.out.printf("%d-%d-%d%n", i, j, k);
		System.out.println(5 * (9 - m) * (9 / d + 1));
	}
}
