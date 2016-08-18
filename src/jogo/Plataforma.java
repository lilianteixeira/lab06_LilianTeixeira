package jogo;

/**
 * 
 * @author Lílian Honorio Teixeira
 *  A classe Plataforma é filha da classe Jogo
 *
 */

import java.util.HashSet;

import exception.EntradaException;
import exception.NumeroInvalidoException;

public class Plataforma extends Jogo{

	private int x2p;
	
	/**
	 * Abaixo os atributos de Plataforma
	 * @param nome
	 * @param preco
	 * @param maiorScore
	 * @param numeroAcessos
	 * @param zerouJogo
	 * @param tipoJogo
	 * @throws EntradaException
	 */
	public Plataforma(String nome, double preco, int maiorScore,
			int numeroAcessos, int zerouJogo, String tipoJogo, HashSet<Jogabilidade> jogabilidade) throws EntradaException{
		
		super(nome, preco, maiorScore, numeroAcessos, zerouJogo, tipoJogo, jogabilidade);
		
		numeroAcessos = 0;
		this.x2p = 0;
	}

	/**
	 * Atualiza o numero de vezes que o jogo foi jogado/acessado
	 * @param numeroAcessos
	 */
	private void numeroAcessos(int numeroAcessos){
		numeroAcessos = numeroAcessos += 1;
		super.setNumeroAcessos(numeroAcessos);
	}
	
	/**
	 * esse metodo e reescrito de Jogo 
	 * @return esse metodo retorna o x2p
	 */
	@Override
	public int registraJogada(int score, boolean zerou) throws NumeroInvalidoException{
	
		if (score < 0){
			
			throw new NumeroInvalidoException("Score");
		} else{
			
			numeroAcessos(getNumeroAcessos());
		
			if (score > super.getMaiorScore()){
			
				super.setMaiorScore(score);
			}
		
			if (zerou){
				int vezesZerou = super.getZerouJogo() +1;
				super.setZerouJogo(vezesZerou);
				x2p += 20 * vezesZerou;
	
			}
		
			return x2p;
		}
	}

	@Override
	public String toString() {
			
		StringBuffer string = new StringBuffer();
				
		string.append(" " + super.getNome() + " - Plataforma :");
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
		if(obj instanceof Plataforma){
			
			Jogo outroJogo = (Plataforma) obj;
			if(super.getNome().equals(outroJogo.getNome()) && super.getPreco() == outroJogo.getPreco()){
				return true;
			}
		}
		return false;
	}
	
	
}