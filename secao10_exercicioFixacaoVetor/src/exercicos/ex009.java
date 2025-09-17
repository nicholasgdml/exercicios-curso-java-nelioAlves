package exercicos;

import java.util.Scanner;

public class ex009 {

	public static void main(String[] args) {
		// mais_velho
			
		Scanner sc = new Scanner(System.in);
		String maiorIdadeNome = "";
		int maisVelho;
		int tamanhoVetor;
		int maiorIdade = 0;
		
		System.out.print("Quantas pessoas voce vai digitar: ");
		tamanhoVetor = sc.nextInt();
		sc.nextLine();
		String[] nomes = new String[tamanhoVetor];
		int[] idades = new int[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for (int i = 0; i < tamanhoVetor; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maiorIdadeNome = nomes[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maiorIdadeNome);
		
		sc.close();
	} 
}
