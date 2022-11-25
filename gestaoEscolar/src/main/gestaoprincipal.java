package main;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class gestaoprincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno x = new aluno();
		
		System.out.println("Digite o nome do aluno:");
		x.nome = sc.nextLine();
		System.out.println("Digite a nota do primeiro trimestre do aluno:");
		x.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre do aluno:");
		x.nota2 = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre do aluno:");
		x.nota3 = sc.nextDouble();
		
		System.out.println(x.notaFinal());
		
		if (x.notaFinal() >=60) {
			System.out.println("Aluno aprovado!");
		}
		else {
			System.out.printf("Aluno reprovado e faltam %.2f pontos para ele ser aprovado", 60-x.notaFinal());
		}
		sc.close();
	}
}
