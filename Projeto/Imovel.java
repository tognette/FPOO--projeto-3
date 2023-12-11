package Projeto;

import java.util.Scanner;

public class Imovel {
	
	Scanner entrada = new Scanner(System.in);
	
	private String local;
	private double valor;
	private int qntQuarto;
	private int qntSala;
	private int capacidadeMaxima;
	
	public Imovel () {
		
	}
	public Imovel(String local, double valor, int qntQuarto, int qntSala, int capacidadeMaxima) {
		this.local = local;
		this.valor = valor;
		this.qntQuarto = qntQuarto;
		this.qntSala = qntSala;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQntQuarto() {
		return qntQuarto;
	}
	public void setQntQuarto(int qntQuarto) {
		this.qntQuarto = qntQuarto;
	}
	public int getQntSala() {
		return qntSala;
	}
	public void setQntSala(int qntSala) {
		this.qntSala = qntSala;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	

}
