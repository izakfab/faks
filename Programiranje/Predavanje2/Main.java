import java.util.Scanner

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Vnesi prvo število: ");
		int prvo = s.nextInt();
		System.out.print("Vnesi drugo število: ")
		int drugo = s.nextInt();
		if (prvo > drugo) {
			System.out.println("Prvo je večje")
		} else if (drugo < prvo {
			System.out.println("Drugo je večje")
		} else {
			System.out.println("Števili sta enaki")
		}
	}
}
