package fag.objetos;



public class Retangulo {

	
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		setLargura(largura);
		setAltura(altura);
	}
	
	public Retangulo() {
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
		}
	}
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public void exibir() {
		System.out.printf("A area é: %.2f \n", area());
		System.out.printf("O perimetro é: %.2f \n", perimetro());
	}
}


