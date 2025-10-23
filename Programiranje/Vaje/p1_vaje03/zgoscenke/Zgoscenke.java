import java.util.Scanner;

public class Zgoscenke {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final int steviloZgoscenk = s.nextInt();
		final long velikostZgoscenk = s.nextLong();
		int trenutnaZgoscenka = 1;
		long trenutnoProstora = velikostZgoscenk;
		long trenutnaDatoteka = s.nextLong();
		boolean done = false;
		while (trenutnaZgoscenka <= steviloZgoscenk && !done) {
			if (trenutnaDatoteka <= trenutnoProstora) {
				trenutnoProstora -= trenutnaDatoteka;
				System.out.printf("%d EP -> zgoscenka %d (%d EP)%n", trenutnaDatoteka, trenutnaZgoscenka, velikostZgoscenk - trenutnoProstora);
				if (s.hasNext())
					trenutnaDatoteka = s.nextLong();
				else
					done = true;
			} else {
				trenutnaZgoscenka++;
				trenutnoProstora = velikostZgoscenk;
			}
		}
	}
}
