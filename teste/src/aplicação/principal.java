package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidade.produto;

public class principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de produtos a serem cadastrados:");
		
		int n = sc.nextInt();
		produto[] vect = new produto[n];
		
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome e preço do produto a ser cadastrado:");
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new produto(nome, preco);
		}
		double media = 0;		
		for (int i = 0; i<n; i++) {
			media += vect[i].getPreco();
		}
		sc.nextLine();
		System.out.printf("A média dos preços é: %.2f%n", media/n);
		sc.close();
	}
}