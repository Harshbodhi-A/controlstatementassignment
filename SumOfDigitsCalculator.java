package controlstatements;

import java.util.Scanner;

public class SumOfDigitsCalculator {

	public static void calculateSumofDigits() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		
		int n = scanner.nextInt();
		int sum =0;
		while(n != 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Sum of digits: " + sum);
		
	}

}
