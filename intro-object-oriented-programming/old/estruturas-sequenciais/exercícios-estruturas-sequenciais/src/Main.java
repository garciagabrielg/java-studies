import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y, soma;
		
		System.out.println("Para a soma, primeiro digite um número inteiro: ");
		x = sc.nextInt();
		
		System.out.println("Agora digite o outro número inteiro: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("O resultado é " + soma);
		
		sc.close();
		
		



	}

}
