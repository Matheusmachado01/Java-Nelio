import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha = 2002;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha invalida ");
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
			
		}
		System.out.println("Acesso permitido ");
		
		sc.close();
	}
	

}
