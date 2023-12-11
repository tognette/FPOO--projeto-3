package Projeto;

import java.util.Scanner;

public class TesteImovel {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Imovel apartamento = new Imovel();
		Imovel casa = new Imovel();
		Imovel apartamento1 = new Imovel();
		Imovel casa1 = new Imovel();
		
		Funcionario f = new Funcionario();
		Client c = new Client();

		apartamento.setLocal("Rio de Janeiro");
		apartamento.setQntQuarto(3);
		apartamento.setQntSala(1);
		apartamento.setCapacidadeMaxima(6);
		apartamento.setValor(550.0);
		
		casa.setLocal("Salvador");
		casa.setQntQuarto(4);
		casa.setQntSala(2);
		casa.setCapacidadeMaxima(8);
		casa.setValor(900.0);
		
		apartamento1.setLocal("Sao Paulo");
		apartamento1.setQntQuarto(1);
		apartamento1.setQntSala(1);
		apartamento1.setCapacidadeMaxima(2);
		apartamento1.setValor(850.0);
		
		casa1.setLocal("Florianopolis");
		casa1.setQntQuarto(2);
		casa1.setQntSala(1);
		casa1.setCapacidadeMaxima(4);
		casa1.setValor(1150.0);
		
		System.out.println("---FAZER CADASTRO---");
		System.out.println("INSIRA SEUS DADOS!!");
		System.out.println("Nome:");
		c.setNome(entrada.next());
		System.out.println("Sobrenome:");
		c.setSobreome(entrada.next());
		System.out.println("Cpf:");
		c.setCpf(entrada.next());
		System.out.println("Email:");
		c.setEmail(entrada.next());
		System.out.println("Idade: ");
		c.setIdade(entrada.nextInt());
		System.out.println("Telefone:");
		c.setTelefone(entrada.nextInt());
		
		f.coletarValor();
		
		System.out.println("Digite o numero de acordo com o seu destino desejado!!");
		System.out.println("- 1 - Apartamento no Rio de Janeiro");
		System.out.println("- 2 - Casa em Salvador ");
		System.out.println("- 3 - Apartamento em Sao Paulo ");
		System.out.println("- 4 - Casa em Florianopolis");
		int escolha = entrada.nextInt();
		switch(escolha) {
		case 1 : 
			System.out.println("-----O APARTAMENTO RJ FOI ESCOLHIDO----");
			System.out.println("---INFORMACOES DO IMOVEL APARTAMENTO---");
			System.out.println("- Localizacao: " + apartamento.getLocal());
			System.out.println("- Quantidade de quartos: " + apartamento.getQntQuarto());
			System.out.println("- Quantidade de salas: " + apartamento.getQntSala());
			System.out.println("- Capacidade Maxima: " + apartamento.getCapacidadeMaxima());
			System.out.println("- Valor: $" + apartamento.getValor());
			System.out.println("----------------------------");
			break;
			
		case 2 :
			System.out.println("----A CASA SALVADOR FOI ESCOLHIDA----");
			System.out.println("---INFORMACOES DO IMOVEL CASA---");
			System.out.println("- Localizacao: " + casa.getLocal());
			System.out.println("- Quantidade de quartos: " + casa.getQntQuarto());
			System.out.println("- Quantidade de salas: " + casa.getQntSala());
			System.out.println("- Capacidade Maxima: " + casa.getCapacidadeMaxima());
			System.out.println("- Valor: $" + casa.getValor());
			System.out.println("----------------------------");
			break;
			
		case 3 : 
			System.out.println("-----O APARTAMENTO SP FOI ESCOLHIDO----");
			System.out.println("---INFORMACOES DO IMOVEL APARTAMENTO---");
			System.out.println("- Localizacao: " + apartamento1.getLocal());
			System.out.println("- Quantidade de quartos: " + apartamento1.getQntQuarto());
			System.out.println("- Quantidade de salas: " + apartamento1.getQntSala());
			System.out.println("- Capacidade Maxima: " + apartamento1.getCapacidadeMaxima());
			System.out.println("- Valor: $" + apartamento1.getValor());
			System.out.println("----------------------------");
			break;
			
		case 4 :
			System.out.println("----A CASA FLORIPA FOI ESCOLHIDA----");
			System.out.println("---INFORMACOES DO IMOVEL CASA---");
			System.out.println("- Localizacao: " + casa1.getLocal());
			System.out.println("- Quantidade de quartos: " + casa1.getQntQuarto());
			System.out.println("- Quantidade de salas: " + casa1.getQntSala());
			System.out.println("- Capacidade Maxima: " + casa1.getCapacidadeMaxima());
			System.out.println("- Valor: $" + casa1.getValor());
			System.out.println("----------------------------");
			break;
		}
		System.out.println("---- A RESERVA FOI FEITA COM SUCESSO ----");
		System.out.println("---Informacoes do cliente ---");
		System.out.println("-Nome: " + c.getNome());
		System.out.println("-Sobrenome: " + c.getSobrenome());
		System.out.println("-Cpf: " + c.getCpf());
		System.out.println("-Email: " + c.getEmail());
		System.out.println("-Idade: " + c.getIdade());
		System.out.println("-Telefone: " + + c.getTelefone());
		
		
	}
	
	
	

}
