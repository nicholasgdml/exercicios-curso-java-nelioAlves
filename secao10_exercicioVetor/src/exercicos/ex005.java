package exercicos;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int maiorValor = 0, posMaior = 0, quantidadeNumeros = 0;
	
	System.out.print("Quantos numeros voce vai digitar: ");
	quantidadeNumeros= sc.nextInt();
	
	int[] numeros = new int[quantidadeNumeros];
	
	for (int i=0; i < quantidadeNumeros; i++) {
		System.out.printf("Digite o nº na posicao %d: ", i);
		numeros[i] = sc.nextInt();
	}
	
	for (int i=0; i < quantidadeNumeros; i++) {
		if (numeros[i] > maiorValor) {
			maiorValor = numeros[i];
			posMaior = i;
		}
	}
	
	System.out.println("MAIOR VALOR: " + maiorValor);
	System.out.println("POSICAO DO MAIOR VALOR " + posMaior);
	
	sc.close();	
	}

}
