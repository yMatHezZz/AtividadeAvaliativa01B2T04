package fag.objetos;

public class Conta {
	
		private String nome;
		private double saldo;
		
		
		public Conta() {}
		
		public Conta(String nome, double saldo){
			setNome(nome);
			setSaldo(saldo);
			
		}
		
	
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			if(nome != null && !nome.isBlank()) {
				 this.nome = nome;
			 }
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			if(saldo >= 0) {
				this.saldo = saldo;
			}
		}
		
		public double depositar(double valor) {
			if(saldo > 0 ) {
				saldo += valor;
				System.out.println("Depósito de " + valor+ " Realizado");
			}
			return saldo;
		}
		
		public double sacar(double valor) {
			if(valor > 0 && saldo - valor >= 0) {
				saldo -= valor;
				System.out.println("Saque realizado");
			}
			return saldo;
		}
		
		
		public void mostrarSaldo() {
			System.out.printf("Titular : %s  Saldo: %.2f \n", nome, saldo);
	
		}
		
}


