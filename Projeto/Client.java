package Projeto;

public class Client extends Pessoa{
	private int acompanhantes;

	public int getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(int acompanhantes) {
		this.acompanhantes = acompanhantes;
	}
	public void desejar() {
		System.out.println("Eu quero...");
	}

}
