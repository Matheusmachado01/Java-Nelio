import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("VALOR A PAGAR = %.2f", total);
		
		sc.close();
		
	}

}
