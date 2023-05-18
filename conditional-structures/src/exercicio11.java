import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda = sc.nextDouble();
		
		double valorImposto;
		if(renda <= 2000.00) {
			valorImposto = 0.0;
		}
		else if (renda <= 3000.00) {
			valorImposto = (renda - 2000.00) * 0.08;
		}
		else if (renda <= 4500.00) {
			valorImposto = (renda - 3000.00) * 0.18 + 1000.0 * 0.08;
		}
		else {
			valorImposto = (renda - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (valorImposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", valorImposto);
		}
	
		sc.close();
	}

}
