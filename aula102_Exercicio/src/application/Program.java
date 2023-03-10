package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j< n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal");
		
		for(int i=0;i<n;i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
		int count = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j< n; j++) {
				if(matrix[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative Numbers: " + count);
		
		sc.close();
	}

}
