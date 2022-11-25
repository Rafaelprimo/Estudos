package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.pessoa;

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		pessoa[] serHumano = new pessoa[n];
		double alturaTotal = 0;
		int menor16 = 0;
		int contador = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.print("Idade:");
			int idade = sc.nextInt();
			System.out.print("Altura:");
			double altura = sc.nextDouble();
			serHumano[i] = new pessoa(nome, idade, altura);
			alturaTotal += serHumano[i].getAltura();
			if (idade<16) {
				menor16 += 1;
			}
		}
		String[] nome16 = new String[menor16];
		
		for (int i = 0; i<n; i++) {
			if (serHumano[i].getIdade() < 16) {
			nome16[contador] = serHumano[i].getNome(); 
			contador += 1;				
			}
		}
		double alturaMedia = alturaTotal/n;
		double percentualMenor16 = ((menor16/n)*100);
		
		System.out.printf("A altura média das pessoas é: %.2f%n", alturaMedia);
		System.out.printf("A porcentagem de pessoas menor de 16 anos é de: %.2f%%", percentualMenor16);
		System.out.println();
		
		System.out.println("Pessoas com menos de 16 anos:");

		for (int i = 0; i<contador; i++) {
			System.out.println(nome16[i]);
		}
		sc.close();
	}
}