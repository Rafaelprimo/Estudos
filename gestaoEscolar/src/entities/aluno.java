package entities;

public class aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	public double pontosQueFaltam() {
		return 60-nota1+nota2+nota3;
	}
	
}	