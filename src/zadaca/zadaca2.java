package zadaca;
import java.util.Scanner;
public class zadaca2 {

	public static void main(String[] args) {
		int k, a, b, c;
		Scanner tastatura = new Scanner(System.in);
		k = tastatura.nextInt();
		a = tastatura.nextInt();
		b = tastatura.nextInt();
		c = tastatura.nextInt();
		if(a<=5 && b<a-c) {
			k=5;
		}
		System.out.println(k);
		
			
		}

	}


