import java.util.Scanner;

public class najblizjiVeckratnik {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int osnova = s.nextInt();
		int primerjava = s.nextInt();
		System.out.println(primerjava / osnova * osnova + ((primerjava % osnova > osnova / 2) ? osnova : 0));
	}
}
