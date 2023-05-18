import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// variaveis x e y
		//enquanto x ou y for > 0  
			//deixar por input
		//se x e y > 0 - primeiro
		//se x <0 e y>0 segundo
		//se x <0 e y <0 terceiro
		//se x > 0 e y < 0 quarto
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			
			else {
				System.out.println("quarto");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();

		}
		
		sc.close();
	}

}
