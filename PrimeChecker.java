package controlstatements;

import java.util.Scanner;

public class PrimeChecker {

	public static void checkPrime() {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive Integer");
		
		int n = scanner.nextInt();
		
		if(n <= 1) {
			System.out.println(n + " is npt a prime number. ");
			return;
		}
		
		boolean isPrime = true;
		int i;
		for(i = 2; i <= Math.sqrt(n); i++);{
			
			if (n % i == 0) {
				isPrime = false;
				
			}
		}
		if(isPrime) {
			System.out.println(n + " is a prime number. ");
		}
		else {
			System.out.println(n + " is not a prime number. ");
		}
		
	}

}
