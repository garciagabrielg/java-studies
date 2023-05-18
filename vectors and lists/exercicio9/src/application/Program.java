package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String [] vectName = new String[n];
		int [] vectAge = new int [n];
		int counter = vectAge[0];
		int olderPerson = 0;

		
		for (int i = 0; i<vectName.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			vectName[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectAge[i] = sc.nextInt();
			if (vectAge[i] > counter) {
				counter = vectAge[i];
				olderPerson = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vectName[olderPerson]);
		

		sc.close();
	}

}
