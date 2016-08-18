package jogo;

/**
 * 
 * @author Lílian Honorio Teixeira
 *  A classe Luta é filha da classe Jogo
 *
 */

import java.util.HashSet;

import exception.EntradaException;
import exception.NumeroInvalidoException;

public class Luta extends Jogo{
	
	private int x2p;
	
	/**
	 * Abaixo os atributos de luta
	 * @param nome
	 * @param preco
	 * @param maiorScore
	 * @param numeroAcessos
	 * @param zerouJogo
	 * @param tipoJogo
	 * @throws EntradaException
	 */
	public Luta(String nome, double preco, int maiorScore, int numeroAcessos,
			int zerouJogo, String tipoJogo, HashSet<Jogabilidade> jogabilidade)  throws  EntradaException{
		
		super(nome, preco, maiorScore, numeroAcessos, zerouJogo, tipoJogo, jogabilidade);
		
		numeroAcessos = 0;
		this.x2p = 0;
	}

	/**
	 * O metodo atualiza o numero de vezes em que o jogo foi jogado/acessado
	 * @param numeroAcessos
	 */
	private void numeroAcessos(int numeroAcessos){
		numeroAcessos = numeroAcessos += 1;
		super.setNumeroAcessos(numeroAcessos);
	}
	
	/**
	 * O metodo e reescritura do metodo da classe mae
	 * @return esse metodo retorna o x2p
	 */
	@Override
	public int registraJogada(int score, boolean zerou) throws NumeroInvalidoException{
		
		if (score < 0){
			throw new NumeroInvalidoException("Score");
		} else {
		
			numeroAcessos(getNumeroAcessos());
			if(score > super.getMaiorScore()){
				
				if (score > 100000){
				score = 100000;
				}
			
				x2p += score / 1000;
				super.setMaiorScore(score);
				
			}
		
			if (zerou){
				int vezesZerou = super.getZerouJogo() +1;
				super.setZerouJogo(vezesZerou);
			}
	
			return x2p;
		}
	}

	@Override
	public String toString() {
		
		StringBuffer string = new StringBuffer();
			
		string.append(" " + super.getNome() + " - Luta :");
		System.out.println("");
		string.append("==> Jogou " + super.getNumeroAcessos() + " vez(es)");
		System.out.println("");
		string.append("==> Zerou " + super.getZerouJogo() + " vez(es)");
		System.out.println("");
		string.append("==> Maior score: " + super.getMaiorScore());
		System.out.println("");
		
		return string.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + x2p;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Luta){
			Jogo outroJogo = (Luta) obj;
			
			if (super.getNome().equals(outroJogo.getNome()) && super.getPreco() == outroJogo.getPreco()){
				return true;
			}
		}
		return false;
	}
	
	
	
	
}