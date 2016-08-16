package jogo;

public class RPG extends Jogo{

	private int maiorScore;
	
	public RPG(String nome, double preco, int maiorScore,
			int quantidadeVezesJogado, int quantidadeVezesZerou) {
		super(nome, preco, quantidadeVezesZerou, quantidadeVezesZerou, quantidadeVezesZerou);
	
		
		
	}

	
	public void registraJogada(int score, boolean zerou ){
		
		if (score > maiorScore){
			maiorScore = score;
		}
		
		//x2p += 10;
		
	}
}
