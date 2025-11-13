import java.util.Scanner;

public class DN04_63250060 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int stSpola = s.nextInt();
		int stevilka = s.nextInt();
		int[] oznake = new int[stSpola];
		long stParov = 0;

		for (int i = 0; i < stSpola; i++) {
			oznake[i] = s.nextInt();
			for (int j = 0; j < i; j++)
				if (oznake[i] + oznake[j] == stevilka)
					stParov += 2;
			if (oznake[i] * 2 == stevilka)
				stParov++;
		}
		s.close();

		System.out.println(stParov);
	}
}
