package controlstatements;

import java.util.Scanner;

public class FactorialCalculator {

	public static void calculateFactorial() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a non-negative integer: ");
		int n = scanner.nextInt();
		
		long factorial = 1;
		  for(int i = 1; i<=n;i++) {
			  factorial += i;
		  }
		  
		  System.out.println("Factorial of " + n + " is: " + factorial);
		
		
	}

}
