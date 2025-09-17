package exercicos;

import java.util.Iterator;
import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		// abaixo da media
		
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		int tamanhoVetor;
		
		System.out.print("Quantos elementos vai ter no vetor?: ");
		tamanhoVetor = sc.nextInt();
		
		double[] vetor = new double[tamanhoVetor];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o numero na pos %d: ",i);
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i];
		}
		
		media = media / vetor.length;
		System.out.println("Média dos valores: " + media);
		
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
