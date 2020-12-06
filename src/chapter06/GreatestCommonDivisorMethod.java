package chapter06;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		int gcd = gcd(n1, n2);

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}

	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			int a = 15;
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
				a = 6;
			}
			
			k++;
		}
		// a = 4;
		
		return gcd;
	}
}
