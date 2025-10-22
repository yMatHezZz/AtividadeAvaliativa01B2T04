package fag.objetos;

public class BicicletaAlugada {

	private int horas;
	private double valorHoras;
	
	
	public BicicletaAlugada(int horas, double valorHoras) {
		setHoras(horas);
		setValorHoras(valorHoras);
	}
	
	public BicicletaAlugada() {
		
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if(horas >= 1) {
			this.horas = horas;
		}
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		if(valorHoras > 0) {
			this.valorHoras = valorHoras;
		}
	}
	
	public double calcularValor() {
		return horas * valorHoras;
	}

	
}
