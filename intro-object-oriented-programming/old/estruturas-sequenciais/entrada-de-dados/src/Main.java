import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double a = 7.0;
		double b = 15.0;
		double c = 3.0;
		double delta;
		double x1, x2;
		
		delta = Math.pow(b, 2.0) -4*a*c;
		
		x1 = (-b + Math.sqrt(delta))/ (2.0*a);
		x2 = (-b - Math.sqrt(delta))/(2.0*a);
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
