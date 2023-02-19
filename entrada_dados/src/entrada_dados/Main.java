package entrada_dados;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int idade = 32;
		String nome = "Maria";
		double x = 10.35784;
		Locale.setDefault(Locale.US); //Colocar ponto como separador em numeros double;
		System.out.println(idade);
		System.out.println(x);
		System.out.println("Bom Dia");
		System.out.printf("%.2f%n",x); //Mostrar numeros double com determinadas casas decimais;
		System.out.println("Resultado " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,x);
	}

}
