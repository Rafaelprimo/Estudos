package entidades;

public class funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void aumentoSalarial(double aumentoEmPercentual) {
		salario += (aumentoEmPercentual/100) * salario;
	}
	
	public String toString() {
		return id
				+ ", "
				+ salario;
	}
}