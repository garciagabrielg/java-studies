package application;

import java.util.Scanner;
import entities.Even;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Even [] vect = new Even[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new Even(number);
		}
		
		System.out.printf("%nNUMEROS PARES:%n");
		int counter = 0;
		for (int i = 0; i<vect.length; i++) {
			if (vect[i].getNumber() %2 == 0) {
				counter += 1;
				System.out.printf("%d ", vect[i].getNumber());
			}
		}

		System.out.printf("%n%nQUANTIDADES DE PARES = %d%n", counter);
		
		sc.close();
	}
}