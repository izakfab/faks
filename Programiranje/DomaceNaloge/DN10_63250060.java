import java.util.*;

public class DN10_63250060 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int vrstic = s.nextInt();
		int stolpcev = s.nextInt();

		int[] tipi = new int[stolpcev];
		for (int i = 0; i < stolpcev; i++) {
			tipi[i] = s.nextInt();
		}

		int kriterijev = s.nextInt();
		int[] kriteriji = new int[kriterijev];
		for (int i = 0; i < kriterijev; i++) {
			kriteriji[i] = s.nextInt();
		}

		ArrayList<ArrayList<Object>> vnosi = new ArrayList<ArrayList<Object>>();

		for (int i = 0; i < vrstic; i++) {
			ArrayList<Object> vnos = new ArrayList<Object>();
			for (int j = 0; j < stolpcev; j++) {
				switch (tipi[j]) {
					case 1: vnos.add(new Tip1(s.nextInt())); break;
					case 2: vnos.add(new Tip2(s.next())); break;
					case 3: vnos.add(new Tip3(s.next())); break;
				}
			}
			vnosi.add(vnos);
		}
		vnosi.sort(new Primerjalnik(tipi, kriteriji));

		for (int i = 0; i < vnosi.size(); i++) {
			for (int j = 0; j < vnosi.get(i).size() - 1; j++) {
				System.out.print(vnosi.get(i).get(j) + "|");
			}
			System.out.println(vnosi.get(i).get(vnosi.get(i).size() - 1));
		}
	}

	static class Tip1 implements Comparable<Tip1> {

		int vrednost;

		public Tip1(int x) {
			this.vrednost = x;
		}

		public int compareTo(Tip1 other) {
			return this.vrednost - other.vrednost;
		}

		@Override
		public String toString() {
			return "" + vrednost;
		}
	}

	static class Tip2 implements Comparable<Tip2> {

		String vrednost;

		public Tip2(String x) {
			this.vrednost = x;
		}

		public int compareTo(Tip2 other) {
			return this.vrednost.compareTo(other.vrednost);
		}

		@Override
		public String toString() {
			return vrednost;
		}
	}

	static class Tip3 implements Comparable<Tip3> {

		String vrednost;

		public Tip3(String x) {
			this.vrednost = x;
		}

		public int compareTo(Tip3 other) {
			if (this.vrednost.equals(other.vrednost)) {
				return 0;
			} if (this.vrednost.equals("da")) {
				if (other.vrednost.equals("ne"))
					return -1;
				return -2;
			} if (this.vrednost.equals("ne")) {
				if (other.vrednost.equals("da"))
					return 1;
				return -1;
			} if (other.vrednost.equals("da")) {
				return 2;
			} return 1;
		}

		@Override
		public String toString() {
			return vrednost;
		}
	}

	static class Primerjalnik implements Comparator<ArrayList<Object>> {

		int[] tipi;
		int[] kriteriji;

		public Primerjalnik(int[] tipi, int[] kriteriji) {
			this.tipi = tipi;
			this.kriteriji = kriteriji;
		}

		public int compare(ArrayList<Object> a, ArrayList<Object> b) {
			for (int kriterij : kriteriji) {
				if (kriterij < 0) {
					int rez;
					switch (tipi[-kriterij - 1]) {
						case 1: rez = ((Tip1) a.get(-kriterij - 1)).compareTo((Tip1) b.get(-kriterij - 1));
								if (rez != 0) return -rez; break;
						case 2: rez = ((Tip2) a.get(-kriterij - 1)).compareTo((Tip2) b.get(-kriterij - 1));
								if (rez != 0) return -rez; break;
						case 3: rez = ((Tip3) a.get(-kriterij - 1)).compareTo((Tip3) b.get(-kriterij - 1));
								if (rez != 0) return -rez; break;
					}
				} else {
					int rez;
					switch (tipi[kriterij - 1]) {
						case 1: rez = ((Tip1) a.get(kriterij - 1)).compareTo((Tip1) b.get(kriterij - 1));
								if (rez != 0) return rez; break;
						case 2: rez = ((Tip2) a.get(kriterij - 1)).compareTo((Tip2) b.get(kriterij - 1));
								if (rez != 0) return rez; break;
						case 3: rez = ((Tip3) a.get(kriterij - 1)).compareTo((Tip3) b.get(kriterij - 1));
								if (rez != 0) return rez; break;
					}
				}
			}
			return 0;
		}
	}
}
