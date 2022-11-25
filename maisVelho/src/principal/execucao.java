package principal;

import java.util.Locale;
import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar?");
		int n = sc.nextInt();
		System.out.println();
		String[] nome = new String[n];
		int[] idade = new int[n];
		int maisVelho = 0;
		String pessoaMaisVelha = "ninguém";
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite os dados da " + (i+1) + "pessoa:");
			System.out.print("Nome:");
			nome[i] = sc.next();
			System.out.print("Idade:");
			idade[i] = sc.nextInt();
			if (idade[i] > maisVelho) {
				pessoaMaisVelha = nome[i];
			}
		}
		
		System.out.println("A pessoa mais velha é: " + pessoaMaisVelha);
		
		sc.close();
	}
}