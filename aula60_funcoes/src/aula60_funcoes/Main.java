package aula60_funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler tres numeros inteiros e mostrar o maior entre eles
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		/*if(A>B && A>C) {
			System.out.println("Higher = " + A);
		}
		else if(B >C) {
			System.out.println("Higher = " + B);
		}else {
			System.out.println("Higher = " + C);
		}*/
		
		int higher = max(A, B, C);
		showResult(higher);
		sc.close();

	}
	
	public static int max(int x, int y, int z) {

		int aux;
		if(x>y && x>z) {
			aux = x;
		}
		else if(y >z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value){
		System.out.println("Higher = " + value);
	}

}
