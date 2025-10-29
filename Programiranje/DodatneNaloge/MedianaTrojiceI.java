import java.util.Scanner;
public class MedianaTrojiceI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int prvo = s.nextInt();
		int drugo = s.nextInt();
		int tretje = s.nextInt();
		System.out.println (prvo <= drugo ? (drugo <= tretje ? drugo : prvo <= tretje ? tretje : prvo) : (prvo <= tretje ? prvo : drugo <= tretje ? tretje : drugo));
	}
}
