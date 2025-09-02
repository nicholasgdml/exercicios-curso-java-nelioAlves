package aplication;

import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroConta;
		double amount;
		String name;
		char opcao;
		Account account;
		
		System.out.print("Enter account number: ");
		numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		opcao = sc.nextLine().toLowerCase().charAt(0);
				
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			account = new Account(name, numeroConta, amount);
			
		} else {
			account = new Account(name, numeroConta);
		}

		System.out.println(); // Quebra de linha
		
		System.out.print(account.toString());
		
		System.out.println(); // Quebra de linha
		
		System.out.println("Enter deposit value: ");
		amount = sc.nextDouble();
		account.depositMoney(amount);
		System.out.print(account.toString());
		
		System.out.println(); // Quebra de linha
		
		System.out.println("Enter withdraw value: ");
		amount = sc.nextDouble();
		account.withdrawMoney(amount);
		System.out.print(account.toString());
		
		sc.close();
	}
}
