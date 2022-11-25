package entidades;

public class produto {
	private String nome;
	private double preco;
	public int qtd;

	public produto() {
	}
	public produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
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
	public int getQtd() {
		return qtd;
	}
	
	public double valortotal() {
		return preco * qtd;
	}
	public int adicionarproduto(int qtd) {
		return this.qtd += qtd;
	}
	public int removerproduto(int qtd) {
		return this.qtd -=qtd;
	}
	public String toString() {
		return nome
				+", "
				+ String.format("%.2f", preco)
				+ ", "
				+ qtd
				+ ", "
				+ String.format("%.2f", valortotal());
	}
}