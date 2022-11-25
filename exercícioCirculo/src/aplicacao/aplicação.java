package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;

public class aplicação {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Circulo c = new Circulo();
		
		System.out.println("Digite o raio a ser utilizado para os cálculos:");
		c.raio = sc.nextDouble();
		
		System.out.printf("Circunferência: %.2f",c.valorDaCircunferência());
		System.out.println();
		System.out.printf("Volume: %.2f",c.volumeDaEsfera());
		System.out.println();
		System.out.println("Pi vale 3.14");
		
		sc.close();
	}

}
