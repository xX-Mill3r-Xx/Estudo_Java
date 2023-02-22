package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		double w = sc.nextDouble();
		rectangle.width = w;
		double h = sc.nextDouble();
		rectangle.height = h;
		
		System.out.printf("AREA = %.2f%n", rectangle.area(w, h));
		System.out.printf(" PERIMETER = %.2f%n", rectangle.perimeter(w, h));
		System.out.printf(" DIAGONAL = %.2f%n", rectangle.diagonal(w, h));
		sc.close();

	}

}
