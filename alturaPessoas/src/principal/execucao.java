package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.pessoa;

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double maiorAltura = 0;
		double menorAltura = 10.00;
		double somaAlturaMulheres = 0;
		double contadorDeMulheres = 0;
		double mediaAlturaMulheres = 0;
		int contadorDeHomens = 0;
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		pessoa[] pessoa = new pessoa[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa:");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa:");
			char genero = sc.next().charAt(0);
			pessoa[i] = new pessoa(altura, genero);
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			if (genero == 'f') {
				somaAlturaMulheres += altura;
				contadorDeMulheres += 1;
			}
			if (genero == 'm') {
				contadorDeHomens += 1;
			}
		}
		mediaAlturaMulheres = somaAlturaMulheres / contadorDeMulheres;
		
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		System.out.printf("Média da altura das mulheres: %.2f", mediaAlturaMulheres);
		System.out.println();
		System.out.println("Número de homens: " + contadorDeHomens);
		
		sc.close();
	}
}