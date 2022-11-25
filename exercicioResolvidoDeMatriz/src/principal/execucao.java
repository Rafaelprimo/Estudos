package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numerosNegativos = new ArrayList<>();
		List<Integer> diagonalPrincipal = new ArrayList<>();
			
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] <0) {
					numerosNegativos.add(mat[i][j]);
				}
				if (i == j) {
					diagonalPrincipal.add(mat[i][j]);
				}
			}
		}
		
		System.out.println("Números negativos:");
		
		for (int i = 0; i<numerosNegativos.size(); i++) {
			if (i != numerosNegativos.size() -1) {
				System.out.print(numerosNegativos.get(i) + ", ");
			}
			else {
				System.out.print(numerosNegativos.get(i) + ".");
			}
			
		}
		System.out.println();
		System.out.println("Diagonal principal:");
		
		for (int i = 0; i<diagonalPrincipal.size(); i++) {
			if (i != (diagonalPrincipal.size() - 1)) {
				System.out.print(diagonalPrincipal.get(i) + ", ");
			}
			else {
				System.out.print(diagonalPrincipal.get(i) + ".");
			}	
		}	
				
		
		
		sc.close();
	}

}
