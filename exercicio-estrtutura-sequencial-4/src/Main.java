import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, horas;
		double salario, valorHora;
		
		N = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Number: " + N);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		
		sc.close();
	}

}
