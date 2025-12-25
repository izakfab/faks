import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		/*Collection<Integer> zbirka = new HashSet<>();
		zbirka.add(20);
		zbirka.add(80);
		zbirka.add(19);
		zbirka.clear();
		System.out.println(zbirka);*/

		/*HashMap<Integer, Integer> seznam = new HashMap<>();
		seznam.put(0,0);
		seznam.put(1,1);
		seznam.put(2,2);
		seznam.put(3,3);
		seznam.put(4,4);
		seznam.put(5,5);
		seznam.put(6,6);
		seznam.put(7,7);
		seznam.put(8,8);
		seznam.put(9,9);
		seznam.put(10,10);
		seznam.put(11,11);
		seznam.put(12,12);
		seznam.put(13,13);
		seznam.put(14,14);
		seznam.put(15,15);
		seznam.put(16,16);
		seznam.put(17,17);
		seznam.put(18,18);
		seznam.put(19,19);
		seznam.put(20,20);
		seznam.put(21,21);
		seznam.put(22,22);
		seznam.put(23,23);
		seznam.put(24,24);
		seznam.put(25,25);
		seznam.put(26,26);
		seznam.put(27,27);
		seznam.put(28,27);
		seznam.put(29,29);
		seznam.put(30,30);
		seznam.put(31,31);
		seznam.put(32,32);
		seznam.put(33,33);
		seznam.put(34,34);
		seznam.put(35,35);
		System.out.println(seznam.get(19));*/

		List<String> imena = new ArrayList<>();
		imena.add("Izak");
		imena.add("Petar");
		imena.add("Jozko");
		imena.add("Ivan");
		imena.add("Marko");

		System.out.println(imena);

		imena.sort(null);
		System.out.println(imena);
		Cas cas1 = new Cas(0, 0);
		System.out.println(cas1.compareTo(new Cas(1, 0)));
	}

	public class Cas implements Comparable<Cas> {

		int ura;
		int minuta;

		public Cas(int u, int m) {
			this.ura = u;
			this.minuta = m;
		}

		@Override
		public int compareTo(Cas drugi) {
			return this.ura * 60 + this.minuta - drugi.ura * 60 + drugi.minuta;
		}
	}
}
