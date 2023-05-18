import java.util.Scanner;
import java.util.Locale;

public class quarto_exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salary = (double) (horas*valorHora);
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}

}
