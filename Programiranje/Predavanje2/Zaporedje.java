import java.util.Scanner;

public class Zaporedje {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Vnesi spodnjo mejo: ");
		int a = s.nextInt();
		System.out.print("Vnesi zgornjo mejo: ");
		int b = s.nextInt();
		
		int stevilo = a;
		while (stevilo <= b) {
			System.out.println(stevilo++);
		}
	}
}
