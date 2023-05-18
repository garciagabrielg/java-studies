package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Height;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Height[] vect = new Height[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa %n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Height(name, age, height);
		}
	
		double average = 0.0, verifyAge = 0.0, percentage = 0.0;
		
		for (int i = 0; i<vect.length; i++) {
			average += vect[i].mediumHeight(vect[i].getHeight(), vect.length);
		}
		System.out.printf("Altura média: %.2f%n", average);
		for (int i = 0; i<vect.length; i++) {
			verifyAge += vect[i].verifyAge(); 
			percentage = vect[i].percentage(verifyAge, vect.length);
		}
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentage);

		for (int i = 0; i<vect.length; i++) {
			if (vect[i].getAge()<16)
			System.out.println(vect[i].getName());
		}
		sc.close();
	}

}
