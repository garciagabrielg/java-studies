import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int userInput = sc.nextInt();
		int senhaCorreta = 2002;
		
		while (userInput != senhaCorreta) {
		System.out.println("Senha Inválida");
		userInput = sc.nextInt();	
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
