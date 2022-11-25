package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.estudante;

// meu problema foi considerar que o quarto é um atributo do estudante.
// A parte de ordenação está dando bug quando quero incluir 10 quartos.

public class execucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int registro = 1;
		String nome;
		String email;
		int quarto;
		int trocaQuarto;
		String trocaNome;
		String trocaEmail;
		int contador = 0;
		int j = 0;
		
		int q = 10;
		estudante[] estudante = new estudante[q];
		
		System.out.println("Digite a quantidade de estudantes que vão alugar quartos:");
		int n = sc.nextInt();
		
		while (n<0 || n > 10) {
			System.out.println("Quantidade de estudantes deve estar entre 1 e 10");
			System.out.println("Digite novamente a quantidade de estudantes que vão alugar quartos:");
			n = sc.nextInt();
		}
		
		for (int i = 0; i<q; i++) {
			estudante[i] = new estudante(0, "vazio", "--", i+1);
		}
		
		for (int t = 0; t<n; t++) {
			System.out.println("Digite o nome, e-mail e quarto desejado do estudante");
			nome = sc.next();
			email = sc.next();
			quarto = sc.nextInt();
			estudante[t].setRegistro(registro);
			estudante[t].setNome(nome);
			estudante[t].setEmail(email);
			estudante[t].setQuarto(quarto);
			registro += 1;
		}
		
		for (int i = 0; i<n; i++) { /* organizou de forma que fosse ordenado por quartos.*/
			while (j<9) {
				while (estudante[contador].getQuarto() > estudante[contador+1].getQuarto() && contador < 9 && j<9) {
					
					trocaQuarto = estudante[contador].getQuarto();
					estudante[contador].setQuarto(estudante[contador+1].getQuarto());
					estudante[contador+1].setQuarto(trocaQuarto);
					
					trocaNome = estudante[contador].getNome();
					estudante[contador].setNome(estudante[contador+1].getNome());
					estudante[contador+1].setNome(trocaNome);
					
					trocaEmail = estudante[contador].getEmail();
					estudante[contador].setEmail(estudante[contador+1].getEmail());
					estudante[contador+1].setEmail(trocaEmail);
					contador += 1;
				}
				contador = 0;
				j += 1;
			}
		}
		for (int i = 0; i<n; i++) {
			if (estudante[i].getNome() != "vazio") {
			System.out.println("Quartos ocupados:" + estudante[i].getQuarto() + ", " + estudante[i].getNome() + ", " + estudante[i].getEmail());
		}
		sc.close();
		}
	}
}