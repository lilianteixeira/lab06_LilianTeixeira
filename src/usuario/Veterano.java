package usuario;

/**
 * 
 * @author Lílian Honorio Teixeira
 *  A classe Veterano é filha da classe Usuario
 *
 */

import exception.NumeroInvalidoException;
import jogo.Jogo;

public class Veterano extends Usuario{

	public Veterano(String nome, String login, double dinheiro, int x2p)
			throws Exception {
		super(nome, login, dinheiro);
		
	}

	/**
	 * @return retorna o precoFinal do jogo, com o desconto
	 */
	@Override
	public double calculaDesconto(double precoJogo) {
		double desconto, precoFinal;
		
		desconto = (precoJogo * 0.20);
		precoFinal = precoJogo - desconto;
		
		return precoFinal;
		
	}

	/**
	 * @return retorna o x2p
	 */
	@Override
	public double x2p(Jogo jogo){
		
		double x2p;
		x2p = jogo.getPreco() * 15;
		
		return x2p;
	}

	/**
	 * registra a jogada que o usuario fez
	 */
	@Override
	public void registraJogada(String nomeDoJogo, int score, boolean zerou) throws NumeroInvalidoException{
		
		int x2pNovo;
		int x2pExtra = 0;
		
		Jogo jogo = buscaJogo(nomeDoJogo);
		jogo.registraJogada(score, zerou);
		
		int x2pAtual = super.getX2p();
				
		x2pNovo = x2pAtual + x2pExtra;
		super.setX2p(x2pNovo);
			
		
	}

	@Override
	public String toString() {

		StringBuffer string = new StringBuffer();
		
		string.append(super.getLogin());
		System.out.println("");
		string.append(super.getNome());
		string.append("Jogador Veterano : "+ super.getX2p() +" x2p");
		System.out.println("");
		string.append("Lista de Jogos:");
		System.out.println("");
		
		return string.toString();
	}

	@Override
	public boolean equals(Object obj){
		
		if(obj instanceof Veterano){
			Usuario outroUsuario = (Veterano) obj;
			
			if(super.getLogin().equals(outroUsuario.getLogin())){
				return true;
			}
		}
		return false;
	}
}