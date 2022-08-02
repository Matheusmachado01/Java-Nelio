package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double Xa, Xb, Xc, Ya, Yb, Yc;

		System.out.println("Enter the measures of triangle X: ");
		Xa = sc.nextDouble();
		Xb = sc.nextDouble();
		Xc = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		Ya = sc.nextDouble();
		Yb = sc.nextDouble();
		Yc = sc.nextDouble();

		double p = (Xa + Xb + Xc) / 2.0;
		double areax = Math.sqrt(p * (p - Xa) * (p - Xb) * (p - Xc));

		p = (Ya + Yb + Yc) / 2.0;
		double areay = Math.sqrt(p * (p - Ya) * (p - Yb) * (p - Yc));

		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle X area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();
	}

}
