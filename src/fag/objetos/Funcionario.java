package fag.objetos;

public class Funcionario {

	
	private String nome;
	private double salario;
	private double percentual;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			 this.nome = nome;
		 }
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		if(salario > 0) {
			this.salario = salario;
		}
	}
	
	public double getPercentual() {
		return percentual;
	}
	
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	
	
	public double aumentarSalario(double percentual) {
		if(percentual > 0 ) {
			this.salario += this.salario * percentual / 100;
		}
		return salario;
	}
	
	public void exibir() {
		System.out.printf("Nome: %s Salário: %.2f \n", nome, salario);
	}
	
}
