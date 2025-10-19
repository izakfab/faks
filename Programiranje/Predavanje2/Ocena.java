import java.util.Scanner;

public class Ocena {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tocke = s.nextInt();
		if (tocke <= 100 && tocke >= 0) {
			if (tocke >= 90) {
				System.out.println(10);
			} else if (tocke >= 80) {
				System.out.println(9);
			} else if (tocke >= 70) {
				System.out.println(8);
			} else if (tocke >= 60) {
				System.out.println(7);
			} else if (tocke >= 50) {
				System.out.println(6);
			} else {
				System.out.println(5);
			}
		} 
	}
}
