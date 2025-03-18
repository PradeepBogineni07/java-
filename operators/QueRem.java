package operators;

import java.util.Scanner;

public class QueRem {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int divisor;
		int dividend;
		int Quotient;
		int Remainder;
		System.out.println("Enter the Divisor:");
		divisor = scanner.nextInt();
		System.out.println("Enter the Dividend:");
		dividend = scanner.nextInt();
		Quotient=dividend/divisor;
		Remainder=dividend-(divisor*Quotient);
		
		System.out.println("The value of Quotient:"+Quotient);
		System.out.println("the value of Remainder:"+Remainder);
		

	}

}
