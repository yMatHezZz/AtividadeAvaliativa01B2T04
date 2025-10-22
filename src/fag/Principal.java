package fag;
import java.util.Scanner;

import fag.objetos.BicicletaAlugada;
import fag.objetos.Conta;
import fag.objetos.ContaLuz;
import fag.objetos.Filme;
import fag.objetos.Funcionario;
import fag.objetos.Musica;
import fag.objetos.Pessoa;
import fag.objetos.ProdutoEstoque;
import fag.objetos.Retangulo;
import fag.objetos.Temperatura;

public class Principal {

	public static void main(String[] args) {
		//atividadeUm();
		//atividadeDois();
		//atividadeTres();
		//atividadeQuatro();
		//atividadeCinco();
		atividadeSeis();
		//atividadeSete();
		//atividadeOito();
		//atividadeNove();
		//atividadeDez();
	}

	public static void atividadeUm() {
		Conta contaUm = new Conta("José", 500.00);
		
		contaUm.mostrarSaldo();
		contaUm.depositar(200);
		contaUm.sacar(100);
		contaUm.mostrarSaldo();
	}
	
	public static void atividadeDois() {
		Filme filmeUm = new Filme("A era do fogo", 5);
		
		filmeUm.exibir();
	}
	
	public static void atividadeTres() {
		Funcionario funcionarioUm = new Funcionario("Carlos", 1000);
		
		funcionarioUm.exibir();
		funcionarioUm.aumentarSalario(10);
		funcionarioUm.exibir();
		
	}
	
	public static void atividadeQuatro() {
		Retangulo retanguloUm = new Retangulo(10, 10);
		
		retanguloUm.exibir();
	}
	
	public static void atividadeCinco() {
		Musica musicaUm = new Musica("Cuiabana", 653 );
		Musica musicaDois= new Musica("Waka waka", 100 );
		
		System.out.println(musicaUm.getNome() + " - " + musicaUm.formatar());
		System.out.println(musicaDois.getNome() + " - " + musicaDois.formatar());
		}
	
	public static void atividadeSeis() {
		Pessoa pessoaUm = new Pessoa("Paulo", 1.70, 50);
			
		pessoaUm.imc();
		pessoaUm.exibirImc();
		pessoaUm.classificacaoImc();
	}
	
	
	public static void atividadeSete() {
		ContaLuz contaUm = new ContaLuz(250, 0.85);
		
		System.out.println("Conta: R$" + contaUm.calcularValorTotal());
	}
	
	public static void atividadeOito() {
		BicicletaAlugada bicicletaUm = new BicicletaAlugada(2, 30.0);
		
		System.out.println("Valor do Aluguel: R$" + bicicletaUm.calcularValor());
	}
	
	public static void atividadeNove() {
		ProdutoEstoque produtoUm = new ProdutoEstoque("Arroz", 10);
		
		produtoUm.adicionarEstoque(5);
		produtoUm.exibir();
		produtoUm.removerEstoque(3);
		produtoUm.exibir();
	}
	
	public static void atividadeDez() {
		Temperatura tempUm = new Temperatura(30);
		
		tempUm.exibir();
	}
}


