package exercicos;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int quantNums, quantNumsPar = 0;
	
	System.out.print("Quantos nºs voce vai digitar: ");
	quantNums = sc.nextInt();
	
	int[] vetor = new int[quantNums];
	for (int i=0; i < vetor.length; i++) {
		System.out.printf("Digite o %dº numero: ", i+1);
		vetor[i] = sc.nextInt();
	}
	
	System.out.println("NUMEROS PARES");
	for (int i=0; i < vetor.length; i++) {
		if (vetor[i] % 2 == 0) {
		System.out.print(vetor[i] + " ");
		quantNumsPar += 1;
		}
	}
	
	System.out.println();
		
	System.out.println("\nQUANTIDADE DE PARES = " +quantNumsPar);
	
	sc.close();
	}
}

