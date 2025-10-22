package fag.objetos;

public class ProdutoEstoque {

	private String nome;
	private int quantidade;
	
	public ProdutoEstoque(String nome, int quantidade) {
		setNome(nome);
		setQuantidade(quantidade);
	}
	
	public ProdutoEstoque() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) {
			 this.nome = nome;
		 }
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidade = quantidade;
		}
	}
	
	public int adicionarEstoque(int qtd) {
		quantidade = quantidade + qtd;
		return quantidade;
	}
	
	public int removerEstoque(int qtd) {
		if(quantidade > 0 && (quantidade - qtd) > 0) {
			quantidade = quantidade - qtd;
		}
		return quantidade;
	}
	
	public void exibir() {
		System.out.printf("O estoque atual de %s é: %d \n", nome, quantidade);
	}
}
