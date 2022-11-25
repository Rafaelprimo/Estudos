package conversorMonetario;

import java.util.Locale;
import java.util.Scanner;
import utilidade.currencyConverter;

public class principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dólar:");
		double cotacao = sc.nextDouble();
		System.out.println("Digite o valor, em dólares, a ser comprado:");
		double valorEmDolar = sc.nextDouble();		
		
		System.out.printf("Você terá que pagar %.2f reais", currencyConverter.conversor(cotacao, valorEmDolar));

		sc.close();
	}

}
