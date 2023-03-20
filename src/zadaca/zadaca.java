package zadaca;
import java.util.Scanner;

public class zadaca {

	public static void main(String[] args) {
		int k;
		Scanner tastatura = new Scanner(System.in);
		k = tastatura.nextInt();
		if(k>6) {
			System.out.println(k);
		}
		else {
			System.out.println("Vrednosta na K e pomala od 6.");
		}
	}
}
