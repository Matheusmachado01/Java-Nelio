package appication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			}
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] <0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		
		sc.close();
	}

}
