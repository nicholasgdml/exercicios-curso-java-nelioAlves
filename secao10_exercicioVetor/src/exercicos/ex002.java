package exercicos;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		// soma_vetor
		
		Scanner sc = new Scanner(System.in);
		double soma = 0, media = 0;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int quantidadeItens = sc.nextInt();
		double[] vect = new double[quantidadeItens];
			
		for (int i = 0; i < quantidadeItens; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < quantidadeItens; i++) {
			soma += vect[i];
		}
		
		media = soma / quantidadeItens;
			
		for (int i = 0; i < quantidadeItens; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}
		
		System.out.print("\n");
		System.out.printf("SOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", media);
	}

}
