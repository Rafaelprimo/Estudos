package entidades;

public class estudante {
	private int registro;
	private String nome;
	private String email;
	private int quarto;
		
	public estudante(int registro, String nome, String email, int quarto) {
		this.registro = registro;
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}	
}