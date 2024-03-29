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
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an deposit value (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y' ) {
			System.out.print("Enter initial deposit? ");
			double initialDeposit = sc.nextDouble();
		account = new Account(number, holder, initialDeposit);
		}
		else { account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:" );
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter deposit Value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
			
		sc.close();
	}

}
