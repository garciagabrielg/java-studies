package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double [] vect = new double[n];
		double average = 0.0; 
		
		for (int i = 0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			average += vect[i]/vect.length;
		}
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", average);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i] < average) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}
