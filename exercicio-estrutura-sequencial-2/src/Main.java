import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Raio, Area, pi = 3.14159;
	    
	    Raio = sc.nextDouble();

	    Area = pi * Raio * Raio;

	    System.out.printf("Area = %.4f%n", Area);

		sc.close();

	}

}
