import java.util.Scanner;

public class DN03_63250060 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long y = s.nextLong();
		long x = s.nextLong();
		int potenca = s.nextInt();
		long zePokrito = 0L;
		long ploscice = 0L;

		for (int i = potenca; i >= 0; i--) {
			int potencaI = (int) Math.pow(2, i);
			long yi = y / potencaI;
			long xi = x / potencaI;
			long pokrije = xi * yi * potencaI * potencaI;
			ploscice += (pokrije - zePokrito) / potencaI / potencaI;
			zePokrito = pokrije;
		}
		System.out.println(ploscice);
	}
}
