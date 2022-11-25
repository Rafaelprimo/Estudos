package produtoEmEstoque;

import java.util.Locale;
import java.util.Scanner;

import entidades.produto;

public class principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do produto:");
		String nome1 = sc.nextLine();
		System.out.println("Digite o preço do produto:");
		double preco1 = sc.nextDouble();
		System.out.println("Digite a quantidade do produto:");
		int qtd1 = sc.nextInt();
		
		produto a = new produto(nome1, preco1, qtd1);

		System.out.println(a.toString());

		System.out.println("Digite a quantidade de produtos a adicionar:");
		int q = sc.nextInt();
		a.qtd = a.adicionarproduto(q);
		System.out.println(a.toString());

		System.out.println("Digite a quantidade de produtos a retirar:");
		q = sc.nextInt();
		a.qtd = a.removerproduto(q);
		System.out.println(a.toString());
	}
}