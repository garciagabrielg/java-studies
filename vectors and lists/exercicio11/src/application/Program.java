package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double [] height = new double[n];
		char [] gender =  new char[n];
		int womenCounter = 0;
		int manCounter = 0;
		double lesserHeight = height[0];
		double higherHeight = height[0];
		
		for (int i = 0; i<height.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			height[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			sc.nextLine();
			gender[i] = sc.nextLine().charAt(0);
		}
		
		double womenSumHeight = 0.0;

		for (int i = 0; i<height.length; i++) {
			
			if (height[i]>higherHeight){
				higherHeight = height[i];
			}
			if (height[i] < lesserHeight) {
				lesserHeight = height[i];
			}
			if (gender[i] == 'F') {
				womenCounter ++;
				womenSumHeight += height[i];
			}
			else {
				manCounter ++; 
			}
		}

		
		double womenAvgHeight = womenSumHeight/womenCounter;
		
		System.out.println("Menor altura = " + lesserHeight);
		System.out.println("Maior altura = " + higherHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", womenAvgHeight);
		System.out.println("Numero de homens = " + manCounter);
		
		sc.close();
	}

}
