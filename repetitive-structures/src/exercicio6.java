import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= 10; i ++ ) {
			int multi = N * i;
			System.out.printf("%d X %d = %d%n",i , N, multi);
			
		}

		sc.close();

	}

}
