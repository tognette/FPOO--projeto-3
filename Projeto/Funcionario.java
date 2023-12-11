package Projeto;

public class Funcionario extends Pessoa{
	private double salario;
	private int registro;
	
	
	public Funcionario() {
		
	}
	public Funcionario(double salario, int registro) {
		this.registro = registro;
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
		
	public void coletarValor() {
		System.out.println("Ola, eu sou a atendente da lacadora de imoveis, aqui filtramos os melhores lugares para voce de acordo com o seu gosto!");
	}	
	

}
