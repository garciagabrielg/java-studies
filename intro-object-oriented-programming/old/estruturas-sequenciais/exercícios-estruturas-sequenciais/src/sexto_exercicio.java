import java.util.Locale;
import java.util.Scanner;

public class sexto_exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangle, areaCircle, areaTrapezium, areaQuadrado, areaRetangulo, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangle = (A*C)/2;
		areaCircle = pi * Math.pow(C, 2.0);
		areaTrapezium = (A+B)/2 * C;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO = %.3f%n", areaTriangle);
		System.out.printf("CIRCULO = %.3f%n", areaCircle);
		System.out.printf("TRAPEZIO = %.3f%n", areaTrapezium);
		System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO = %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
