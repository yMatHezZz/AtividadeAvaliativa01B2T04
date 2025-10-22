package fag.objetos;

public class Musica {

	
	private String nome;
	private int duracaoSegundos;
	
	public Musica(String nome, int duracaoSegundos) {
		setNome(nome);
		setDuracaoSegundos(duracaoSegundos);
	}
	
	public Musica() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			 this.nome = nome;
		 }
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		if(duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
		
		
	public String formatar(){
		int minutos = duracaoSegundos / 60; 
		int segundos = duracaoSegundos % 60;
		return String.format("%02d : %02d", minutos, segundos);
	}
	}


	

