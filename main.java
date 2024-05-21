package controlstatements;

import java.util.Scanner;

public class main {
	
	static String PASSWORD = "JAVA";
	static Scanner scanner = new Scanner(System.in);
	
	
	private static boolean authenticateUser() {
		for(int i = 0; i<3; i++) {
			System.out.print("Enter password: ");
			String input = scanner.nextLine();
			if (PASSWORD.equals(input)) {
				return true;
			}
			else {
				System.out.println("Incorrect password. Try again");
			}
		}
		return false;
	}
	
	private static void showmenu() {
		
		while(true) {
			System.out.println("\nMenu");
			System.out.println("1. Factorial Calculator");
			System.out.println("2. Fibonacci Sequence");
			System.out.println("3. Prime Number Check");
			System.out.println("4. Sum of Digits");
			System.out.println("5. Reverse Number");
			System.out.println("6. Exit");
			System.out.println("Choose an option: ");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: 
				FactorialCalculator.calculateFactorial();
				break;
			case 2:
				FibonacciCalculator.calculateFibonacci();
				break;
			case 3:
				PrimeChecker.checkPrime();
				break;
			case 4:
				SumOfDigitsCalculator.calculateSumofDigits();
				break;
			case 5:
				ReverseNumberCalculator.reverseNumber();
			case 6:
				System.out.println("Exiting program");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			  
			}
		}
	}

	public static void main(String[] args) {
		
		if (authenticateUser()) {
			showmenu();
		}
		else {
			System.out.println("Too many failed attemps.");
		}

	}

}
