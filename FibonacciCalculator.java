package controlstatements;

import java.util.Scanner;

public class FibonacciCalculator {

	public static void calculateFibonacci() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a non-negative integer:");
		
		int n = scanner.nextInt();
		long a=0, b=1, next;
		if(n == 0) {
			System.out.println("Fibonacci number at position " + n + "is: " + a);
			return;
		}
		
		for(int i=2; i<=n; i++) {
			next = a+b;
			a=b;
			b=next;
		}
		System.out.println("Fibonacci number at position " + n + " is: " +b);
	}

}
