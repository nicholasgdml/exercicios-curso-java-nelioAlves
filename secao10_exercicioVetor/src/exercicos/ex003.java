package exercicos;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// Alturas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int numeroPessoas = sc.nextInt();
		
		
		for (int i = 0; i < numeroPessoas; i++) {
			System.out.printf("Dados %dª pessoa:\n", i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			Double altura = sc.nextDouble();
		}

	}

}
