package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stok: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + product);
		System.out.print("Enter the number of products to be added from stock: ");
		int quantity = sc.nextInt();
		product.AddProduct(quantity);
		System.out.println("Update Data: " + product);
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProduct(quantity);
		System.out.println("Update Data: " + product);
		
		sc.close();

	}

}
