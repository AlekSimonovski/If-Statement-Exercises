package zadaca;
import java.util.Scanner;

public class zadaca {

	public static void main(String[] args) {
		int k;
		Scanner tastatura = new Scanner(System.in);
		k = tastatura.nextInt();		///Se vnesuva korisnicka vrednost na promenliva K.
		if(k>6) {						///Dokolku K e pogolemo od 6, se pecati K.
			System.out.println(k);
		}
		else {						///Dokolku vrednosta na K e pomala od 6, se pecati slednata poraka.
			System.out.println("Vrednosta na K e pomala od 6.");
		}
	}
}
