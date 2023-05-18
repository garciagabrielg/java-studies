import java.util.Locale;
import java.util.Scanner;

public class expressaoCondicionalTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("Valor do produto: R$ %.2f%n", preco);
		System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
		System.out.printf("Valor a pagar: R$ %.2f%n", (preco-desconto));
		
		sc.close();
	}

}
