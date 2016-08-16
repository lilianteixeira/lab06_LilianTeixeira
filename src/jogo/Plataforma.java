package jogo;

public class Plataforma extends Jogo{
	
	private int maiorScore;

	public Plataforma(String nome, double preco, int maiorScore,
			int quantidadeVezesJogado, int quantidadeVezesZerou) {
		super(nome, preco, maiorScore, quantidadeVezesJogado, quantidadeVezesZerou);

	
	}

	public void registraJogada(int score, boolean zerou ){
		
		if (score > maiorScore){
			maiorScore = score;
		}
		
		if(zerou == true){
			//x2p+= 20;
		}
		
	}
}
