package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculatior;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculatior calc = new Calculatior();
		
		System.out.print("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circuferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", calc.PI);

		
		sc.close();

	}
	
	

}

