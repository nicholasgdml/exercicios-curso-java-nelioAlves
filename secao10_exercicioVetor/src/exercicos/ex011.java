package exercicos;

import java.util.Locale;
import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		// dados_pessoa
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numPessoas;
		double menorAltura = 99999;
		double maiorAltura = 0;
		double mediaMulheres;
		double alturasMulheres= 0.0;
		int numeroMulheres = 0;
		int numeroHomens = 0;
		
		System.out.print("Quantas pessoas serao digitadas: ");
		numPessoas = sc.nextInt();
		sc.nextLine();
		
		double[] alturas = new double[numPessoas];
		char[] generos = new char[numPessoas];
		
		for (int i = 0; i < numPessoas; i++) {
			System.out.printf("%dª pessoa:\n", i+1);
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero: ");
			generos[i] = sc.next().toUpperCase().charAt(0);
		}
		
		for (int i = 0; i < numPessoas; i++) {
			if (generos[i] == 'F') {
				numeroMulheres += 1;
				alturasMulheres += alturas[i];
			} else {
				numeroHomens += 1;
			}
		
		}
		
		for (int i = 0; i < numPessoas; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		
		mediaMulheres = alturasMulheres / numeroMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
		System.out.printf("Numero de mulheres = %d\n", numeroHomens);
	
		sc.close();
	}
}
