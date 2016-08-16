package jogo;

public class Luta extends Jogo {

	private int maiorScore;
	
	public Luta(String nome, double preco, int maiorScore,
			int quantidadeVezesJogado, int quantidadeVezesZerou) {
		super(nome, preco, maiorScore, quantidadeVezesJogado, quantidadeVezesZerou);
		
		
	}

		
	public void registraJogada(int score, boolean zerou ){
		
		//rever pontucao do x2p;
		if (score > maiorScore){
			maiorScore = score;
		}
		
	}
	
}
