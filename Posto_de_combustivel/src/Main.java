import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO ");
		System.out.println("ALCOOL = " + alcool);
		System.out.println("GASOLINA = " + gasolina);
		System.out.println("DIESEL = " + diesel);

		sc.close();

	}

}
