package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		CurrencyConverter calc = new CurrencyConverter();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
        double cotacao = sc.nextDouble();
        
        System.out.print("Quantos dolares pretende comprar? ");
        double valorDolar = sc.nextDouble();
        
        calc.calcularValorReal(valorDolar, valorDolar, cotacao);
        System.out.println("Valor a ser pago em reais " + calc.ValorReal);
		
		sc.close();

	}

}
