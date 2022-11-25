package teste1;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;


public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US); //importa a forma de pontuação americana.
		Scanner sc = new Scanner (System.in); //importa a biblioteca de comandos para que a IDE possa ler dados.
		Product x;
		x = new Product();
		x.name = sc.nextLine();
		x.price = sc.nextDouble();
		x.quantity = sc.nextInt();
		
		
		System.out.println(x.toString());
		
		sc.close();
	}
}