package principal;

import java.util.Locale;
import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números darão entrada:");
		System.out.println();
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		double media = 0;
		
		for (int i =0; i<n; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		media = soma / n;
		
		System.out.printf("A média aritmética é: %.3f", media);
		System.out.println();
		
		System.out.println("Elementos abaixo da média:");
		for (int i =0; i<n; i++) {
			if (vect[i]<media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}