package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there  na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} 
		else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		System.out.println("Updated data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a witdraw value: ");
		double witdraw = sc.nextDouble();
		account.withdraw(witdraw);
		System.out.println("Updated data: ");
		System.out.println(account);
		
		sc.close();
	}

}
