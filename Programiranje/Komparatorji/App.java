import java.util.*;

public class App {
	public static void main(String[] args) throws Exception {

		List<Oseba> osebe = new ArrayList<Oseba>();
		osebe.add(new Oseba("oseba A", "priimek A", 20));
		osebe.add(new Oseba("oseba B", "priimek B", 30));
		osebe.add(new Oseba("oseba C", "priimek A", 10));

		Collections.sort(osebe, Oseba.primerjalnikPoStarosti());

		for (Oseba oseba : osebe) {
			System.out.println(oseba);
		}

		Collections.sort(osebe, Oseba.primerjalnikPoPriimkuInImenu());

		for (Oseba oseba : osebe) {
			System.out.println(oseba);
		}
	}
}
