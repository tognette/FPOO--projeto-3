package Projeto;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private int idade;
	private int telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobreome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone){
		this.telefone = telefone;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
