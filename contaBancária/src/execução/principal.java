package execução;

import java.util.Locale;
import java.util.Scanner;

import entidades.conta;

public class principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valorParaAlterar = 0;
		
		System.out.println("Digite o número da conta:");
		String numeroConta = sc.nextLine();
		System.out.println("Digite o nome do titular da conta:");
		String nomeDoTitular = sc.nextLine();
		System.out.println("Há um valor inicial de depósito (y/n)?");
		char afirmacao = sc.next().charAt(0);
		
		conta a = new conta(numeroConta, nomeDoTitular, valorParaAlterar);		
		
		if (afirmacao == 'y') {
			System.out.println("Digite o valor inicial a ser depositado:");
			valorParaAlterar = sc.nextDouble();
			a.deposito(valorParaAlterar);			
		}
		
		System.out.println(a.toString());
		
		System.out.println("Digite o valor a ser depositado:");
		double valorDeDeposito = sc.nextDouble();
		a.deposito(valorDeDeposito);
		System.out.println(a.toString());

		System.out.println("Digite o valor a ser sacado:");
		valorParaAlterar = sc.nextDouble();
		a.saque(valorParaAlterar);
		System.out.println(a.toString());
	
		sc.close();
	}
}