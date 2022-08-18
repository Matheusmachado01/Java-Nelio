package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		
		
		System.out.println();
		System.out.println("Produtc Data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Produtc Data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removedProducts(quantity);
		
		System.out.println();
		System.out.println("Produtc Data: " + product);
		
		
		sc.close();
	}

}
