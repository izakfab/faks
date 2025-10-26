import java.util.Scanner;

public class Krog {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int velikost = s.nextInt();
		double polmer = velikost;
		for (int i = 0; i < velikost * (20/9); i++) {
			String line = "";
			for (int j = 1; j < velikost * (20/9); j++)
				 line = line + (Math.sqrt(Math.pow((i - polmer) * (20/9), 2) + Math.pow(j - polmer, 2)) < polmer ? "+" : " ");
			if (line.charAt((int) polmer) == '+')
				System.out.println(line);
		}
	}
}
