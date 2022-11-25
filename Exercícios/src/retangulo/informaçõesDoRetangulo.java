package retangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class informaçõesDoRetangulo {
	public static void main(String[] args) {
	Locale.setDefault (Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor da altura e da largura do Retângulo:");
	Rectangle x = new Rectangle();
	x.width = sc.nextDouble();
	x.height = sc.nextDouble();
	
	System.out.println(String.format("Area = %.2f",x.area()));
	System.out.println(String.format("Perimetro = %.2f",x.perimeter()));
	System.out.println(String.format("Diagonal = %.2f",x.diagonal()));
	
	sc.close();
	}
}