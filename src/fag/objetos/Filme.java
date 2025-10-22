package fag.objetos;

public class Filme {

	private String titulo;
	private double avaliacao;
	
	public Filme() {
		
	}
	
	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isBlank() ) {
			this.titulo = titulo;
		}
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		if(avaliacao >= 0 && avaliacao <= 5) {
			this.avaliacao = avaliacao;
		}
		
	}
	
	public void exibir() {
		System.out.printf( "Filme: %s | Avaliação: %.1f ⭐", titulo, avaliacao);
	}
	
}
