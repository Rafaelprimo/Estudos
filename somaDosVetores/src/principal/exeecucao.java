package principal;

import java.util.Locale;
import java.util.Scanner;

public class exeecucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores terá cada vetor?");
		int n = sc.nextInt();
		
		double[] vectA = new double[n];
		double[] vectB = new double[n];
		double[] vectC = new double[n];

		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i<n; i++) {
			vectA[i] = sc.nextDouble();
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i<n; i++) {
			vectB[i] = sc.nextDouble();
		}
		
		
		System.out.println("Vetor resultante:");
		for (int i = 0; i<n; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}
}