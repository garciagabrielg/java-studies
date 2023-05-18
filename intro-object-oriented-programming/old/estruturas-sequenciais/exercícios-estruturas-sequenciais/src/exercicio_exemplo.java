import java.util.Scanner;
import java.util.Locale;

public class exercicio_exemplo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura: ");
		double largura = sc.nextDouble();
		
		System.out.println("Comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Valor do m²: ");
		double preco = sc.nextDouble();
		
		double area = (largura*comprimento);
		double valorTerreno = area * preco;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", valorTerreno);
		
		sc.close();
	}
}