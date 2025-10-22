package fag.objetos;

import java.io.PrintStream;



public class Pessoa {

	
	private String nome;
	private double altura;
	private double peso;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, double altura, double peso) {
		setNome(nome);
		setAltura(altura);
		setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			 this.nome = nome;
		 }
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
		
	}
	
	public double imc(){
		return peso/(altura * altura);
	}
	
	 public void classificacaoImc() {
	        double valorImc = imc();

	        if (valorImc < 18.5) {
	            System.out.println("Abaixo do peso");
	        } else if (valorImc <= 24.9) {
	            System.out.println("Peso normal");
	        } else if (valorImc <= 29.9) {
	            System.out.println("Sobrepeso");
	        } else if (valorImc <= 34.9) {
	            System.out.println("Obesidade grau I");
	        } else if (valorImc <= 39.9) {
	            System.out.println("Obesidade grau II");
	        } else {
	            System.out.println("Obesidade grau III (mórbida)");
	        }
	    }
	 
	 public PrintStream exibirImc() {
		    return System.out.printf("IMC: %.2f \n", imc());
		}
	
}
