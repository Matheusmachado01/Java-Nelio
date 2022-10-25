package applicarion;

import java.util.Locale;
import java.util.Scanner;

import util.Currency_Converter;

public class Program {

	public static void main(String[] args) {


		public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("What is the dollar price? ");
			double dolarPrice = sc.nextDouble();
			System.out.print("How many dollars will be bought? ");
			double amount = sc.nextDouble();
			double result = Currency_Converter.dollarToReal(amount, dolarPrice);
			System.out.printf("Amount to be paid in reais = %.2f", result);
			
			sc.close();
		

	
	
	}
	
	
}
