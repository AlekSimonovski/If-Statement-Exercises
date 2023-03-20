package zadaca;
import java.util.Scanner;
public class zadaca2 {

	public static void main(String[] args) {
		int k, a, b, c; ///Initializing variables k, a, b and c.
		Scanner tastatura = new Scanner(System.in);		///Creating a scanner for user input.
		k = tastatura.nextInt();	///User inputs integer values for each variable
		a = tastatura.nextInt();
		b = tastatura.nextInt();
		c = tastatura.nextInt();
		if(a<=5 && b<a-c) {			///Conditional structure if.
			k=5;
		}
		System.out.println(k);		///Printing value of k.
		
			
		}

	}


