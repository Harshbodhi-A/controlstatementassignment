package controlstatements;

import java.util.Scanner;

public class ReverseNumberCalculator {

	public static void reverseNumber() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positivev interger: ");
		
		int n = scanner.nextInt();
		
		int reversed = 0;
		
		while(n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		System.out.println("Reversed number: " + reversed);
		
	}

}
