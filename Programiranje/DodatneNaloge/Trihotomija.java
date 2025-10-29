import java.util.Scanner;

public class Trihotomija {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		if (v1 < v2)
			System.out.println(-1);
		else if (v1 > v2)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
