package exercicos;

import java.util.Locale;
import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		// aprovados

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tamanhoVetor;
		double media;
		
		System.out.print("Quantos alunos serao digitados?: ");
		tamanhoVetor = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[tamanhoVetor];
		double[] notas1 = new double[tamanhoVetor];
		double[] notas2 = new double[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.printf("Dados %dª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Nota1: ");
			notas1[i] = sc.nextDouble();
			System.out.print("Nota 2: ");
			notas1[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("ALUNOS REPROVADOS:");
		for (int i = 0; i < tamanhoVetor; i++) {
			media = notas1[i] + notas2[i] / 2;
			
			if (media > 6) {
				System.out.println(nomes[i]);
			}
		}
	}

}
