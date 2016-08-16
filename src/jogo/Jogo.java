package jogo;

public class Jogo {
	
	private String nome;
	private double preco;
	private int maiorScore; //começa igual a zero , só atualiza se a nova for maior que a atual
	private int quantidadeVezesJogado; //começa igual a zero
	private int quantidadeVezesZerou;
	
	//construtor
	public Jogo(String nome, double preco, int maiorScore, int quantidadeVezesJogado, int quantidadeVezesZerou) {

		this.nome = nome;
		this.preco = preco;
		this.maiorScore = 0;
		this.quantidadeVezesJogado = 0;
		this.quantidadeVezesZerou = quantidadeVezesZerou;
		
	}

	//acessadores e modificadores
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getMaiorScore() {
		return maiorScore;
	}

	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	public int getQuantidadeVezesJogado() {
		return quantidadeVezesJogado;
	}

	public void setQuantidadeVezesJogado(int quantidadeVezesJogado) {
		this.quantidadeVezesJogado = quantidadeVezesJogado;
	}

	public int getQuantidadeVezesZerou() {
		return quantidadeVezesZerou;
	}

	public void setQuantidadeVezesZerou(int quantidadeVezesZerou) {
		this.quantidadeVezesZerou = quantidadeVezesZerou;
	}

	//rever
	public void registraJogada(int score, boolean zerou ){
		
			
		
	}
	
}
