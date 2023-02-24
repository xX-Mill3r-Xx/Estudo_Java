package application;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit? (y/n)? ");
		char resp = sc.next().charAt(0);
		if(resp == 'y' || resp == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number,holder, initialDeposit);
		}
		else {
			acc = new Account(number,holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		
		acc.Deposit(value);
		System.out.println();
		System.out.println("Update Account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a witdraw value: ");
		double Wvalue = sc.nextDouble();
		
		acc.withDrawn(Wvalue);
		System.out.println();
		System.out.println("Update Account data: ");
		System.out.println(acc);
		System.out.println();
		
		sc.close();
	}

}
