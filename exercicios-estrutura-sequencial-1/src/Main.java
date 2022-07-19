import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x, y, soma;
		
		x = sc.nextInt();
		sc.nextLine();
		y = sc.nextInt();
		
		soma = x + y;
		System.out.println("Soma = " + soma);
		
		
		sc.close();
	}

}
