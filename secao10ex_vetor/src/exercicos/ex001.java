package exercicos;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		// Negativos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		 int tam = sc.nextInt();
		
		int[] vect = new int[tam];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números negativos: ");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
