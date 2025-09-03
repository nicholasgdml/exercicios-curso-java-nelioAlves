package exercicos;

import java.util.Locale;
import java.util.Scanner;
 
public class ex003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int numPessoas, pessoasMenores;
		double alturaTotal, mediaAltura, porcentagemMenores;
		
		System.out.print("Quantas pessoas serão digitadas: ");
		numPessoas = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[numPessoas];
		int[] idades = new int[numPessoas];
		double[] alturas = new double[numPessoas];
		
		for (int i = 0; i < numPessoas; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		pessoasMenores = 0;
		alturaTotal = 0;
		
		for (int i = 0; i < numPessoas; i++) {
			if (idades[i] < 16) {
				pessoasMenores += 1;
			}
			alturaTotal += alturas[i];
		}
		
		mediaAltura = alturaTotal / numPessoas;
		porcentagemMenores = (pessoasMenores / numPessoas) * 100;
		
		System.out.printf("\n Altura Media: %2.f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", porcentagemMenores);
		
		for (int i = 0; i < numPessoas; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
