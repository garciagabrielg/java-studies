package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		int majorPosition = 0;
		double major = vect[0];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > major) {
				major = vect[i];
				majorPosition = i;
			}
		}
		
		System.out.printf("%nMAIOR VALOR = %.2f%n", major);
		System.out.println("POSICAO DO MAIOR VALOR = " + majorPosition);

		sc.close();
	}
}
