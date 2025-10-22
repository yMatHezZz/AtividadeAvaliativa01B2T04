package fag.objetos;

public class Temperatura {

	private double celsius;
	
	public Temperatura(double celsius) {
		setCelsius(celsius);
	}
	
	public Temperatura() {
		
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		if(celsius > -273.15) {
			this.celsius = celsius;
		}
	}
	
	public double paraFahrenheit() {
		return (celsius * (9/5)) + 32; 
	}
	
	public double paraKelvin() {
		return celsius + 273.15;
	}
	
	public void exibir() {
		System.out.printf("A temperatura de %.2f graus celsius em Fahrenheits é: %.2f graus \n", celsius, paraFahrenheit());
		System.out.printf("A temperatura de %.2f graus celsius em Kelvin é: %.2f graus \n", celsius, paraKelvin());
	}
	
	
}
