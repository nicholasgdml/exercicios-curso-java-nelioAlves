package exercicos;

import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// soma_vetores
		
		Scanner sc = new Scanner(System.in);
		int tamanhoVetor;
		
		System.out.print("Digite o tamanho de cada vetor: ");
		tamanhoVetor = sc.nextInt();
		
		int[] vetorA = new int[tamanhoVetor];
		int[] vetorB = new int[tamanhoVetor];
		int[] vetorC = new int[tamanhoVetor];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i< tamanhoVetor; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i< tamanhoVetor; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("SOMANDO...");
		for (int i=0; i< tamanhoVetor; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Vetor Resultante");
		for (int i=0; i< tamanhoVetor; i++) {
			System.out.println(vetorC[i]);
		}
		
		sc.close();
	}

}
