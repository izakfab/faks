import java.util.*;

public class Oseba {

	private String ime;
	private String priimek;
	private int starost;

	public Oseba(String ime, String priimek, int starost) {
		this.ime = ime;
		this.priimek = priimek;
		this.starost = starost;
	}

	public String toString() {
		return ime + " " + priimek + " (" + starost + " let)";
	}

	public static Comparator<Oseba> primerjalnikPoStarosti() {
		/*return new Comparator<Oseba>() {
			@Override
			public int compare(Oseba o1, Oseba o2) {
				return o1.starost - o2.starost;
			}
		};*/
		/*return (Oseba o1, Oseba o2) -> {
			return o1.starost - o2.starost;
		};*/
		return (o1, o2) -> o1.starost - o2.starost;
	}

	public static Comparator<Oseba> primerjalnikPoPriimkuInImenu() {
		return (o1, o2) -> o1.priimek.compareTo(o2.priimek) != 0 ? o1.priimek.compareTo(o2.priimek) : o1.ime.compareTo(o2.ime);
	}
}
