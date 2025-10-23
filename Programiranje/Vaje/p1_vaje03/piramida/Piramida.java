import java.util.Scanner;
public class Piramida {
	public static void main() {
		Scanner s = new Scanner(System.in);
		int velikost = s.nextInt();
		for (int i = 1; i <= velikost; i++) {
			for (int j = 0; j < velikost - i; j++) System.out.print(" ");
			for (int j = 0; j < i - 1; j++) System.out.print("**");
			System.out.println("*");
		}
	}
}
