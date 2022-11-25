package entidade;

public class produto {
	private String nome;
	private double preco;
	
	public produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public produto(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}