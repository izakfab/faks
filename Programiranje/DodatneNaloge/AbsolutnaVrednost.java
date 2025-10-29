import java.util.Scanner;

public class absolutnaVrednost {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vnos = s.nextInt();
		if (vnos < 0)
			vnos *= -1;
		System.out.println(vnos);
	}
}
