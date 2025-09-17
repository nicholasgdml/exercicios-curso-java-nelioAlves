package exercicos;

import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		// media_pares

		Scanner sc = new Scanner(System.in);
		int tamanhoVetor;
		int somaPares = 0;
		int mediaPares = 0;
		int quantidadeNumPar = 0;
		
		System.out.print("Quantos elementos vai ter o vator?: ");
		tamanhoVetor = sc.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i < tamanhoVetor; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				quantidadeNumPar += 1;
			}
		}
		
		
		if (somaPares != 0) {
			mediaPares = somaPares / quantidadeNumPar;
			System.out.println("MEDIA DOS PARES = " + mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
	}

}
