import java.util.Scanner;

public class DN02_63250060 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int vrsta = s.nextInt();
		int velikost = s.nextInt();
		int steviloPritiskov = s.nextInt();
		int prejsnjaTipka = s.nextInt();
		int vsota = 0;

		for (int i = 1; i < steviloPritiskov; i++) {
			int tipka = s.nextInt();
			vsota += razlika(vrsta, velikost, prejsnjaTipka, tipka);
			prejsnjaTipka = tipka;
		}
		System.out.println(vsota);
	}
	
	static int razlika(int vrsta, int velikost, int prej, int potem) {
		int rezultat = 0;
		switch (vrsta) {
			case 1: 
				rezultat += Math.abs(ravnovrstnicaX(potem) - ravnovrstnicaX(prej));
				break;
			case 2:
				rezultat += Math.abs(kvadratnicaX(velikost, potem) - kvadratnicaX(velikost, prej));
				rezultat += Math.abs(kvadratnicaY(velikost, potem) - kvadratnicaY(velikost, prej));
				break;
			case 3:
				rezultat += Math.abs(piramidnicaX(velikost, potem) - piramidnicaX(velikost, prej));
				rezultat += Math.abs(piramidnicaY(potem) - piramidnicaY(prej));
				break;
			case 4:
				rezultat += Math.abs(spiralnicaX(velikost, potem) - spiralnicaX(velikost, prej));
				rezultat += Math.abs(spiralnicaY(velikost, potem) - spiralnicaY(velikost, prej));
				break;
		}
		return rezultat;
	}

	static int ravnovrstnicaX(int tipka) {
		return tipka;
	}

	static int ravnovrstnicaY(int tipka) {
		return 0;
	}

	static int kvadratnicaX(int velikost, int tipka) {
		return tipka % velikost;
	}

	static int kvadratnicaY(int velikost, int tipka) {
		return tipka / velikost;
	}

	static int piramidnicaX(int velikost, int tipka) {
		return tipka - piramidnicaY(tipka) * piramidnicaY(tipka) + velikost - piramidnicaY(tipka) - 1;
	}

	static int piramidnicaY(int tipka) {
		return (int) Math.sqrt(tipka);
	}

	static int spiralnicaX(int velikost, int tipka) {
		int koren = (int) Math.sqrt(tipka);
		if (koren % 2 == 1) {
			if (tipka <= koren * (koren + 1))
				return velikost / 2 - koren / 2 - 1 + tipka - koren * koren;
			return velikost / 2 + koren / 2 + 1;
		} else {
			if (tipka == koren * koren)
				return velikost / 2 + koren / 2;
			if (tipka <= koren * (koren + 1))
				return velikost / 2 + koren / 2 - tipka + koren * koren + 1;
			return velikost / 2 - koren / 2;
		}
	}

	static int spiralnicaY(int velikost, int tipka) {
		int koren = (int) Math.sqrt(tipka);
		if (tipka == 0) return velikost / 2;
		if (koren % 2 == 1) {
			if (tipka <= koren * (koren + 1))
				return velikost / 2 - (koren + 1) / 2;
			return velikost / 2 - (koren + 1) / 2 + tipka - koren * (koren + 1) - 1;
		}
		if (tipka == koren * koren) return koren / 2 - 1 + velikost / 2;
		if (tipka <= koren * (koren + 1)) return koren / 2 + velikost / 2;
		return koren / 2 + velikost / 2 - tipka + koren * (koren + 1) + 1;
	}
}
