package jogo;

import exception.EntradaException;
import exception.NumeroInvalidoException;
import exception.StringInvalidaException;

/**
 * 
 * @author Lílian Honorio Teixeira
 * A classe Jogo e mae das classes RPG, Plataforma e Luta
 *
 */

public class Jogo {
	
	private String nome;
	private double preco;
	private int maiorScore ;
	private int numeroAcessos ;
	private int zerouJogo ;
	private String tipoJogo;
	
	/**
	 * Abaixo os atributos do metodo jogo
	 * @param nome
	 * @param preco
	 * @param maiorScore
	 * @param numeroAcessos
	 * @param zerouJogo
	 * @param tipoJogo
	 * @throws EntradaException
	 * Esse método lanca uma excecao caso o nome ou preco seja invalido 
	 */
	public Jogo(String nome, double preco, int maiorScore, int numeroAcessos, int zerouJogo, String tipoJogo) throws EntradaException {
		
		if (nome == null || nome == ""){
			throw new StringInvalidaException("Nome do jogo não pode ser nulo ou vazio");
		} 
		
		if (preco <= 0){
			throw new NumeroInvalidoException(" Preco nao pode ser igual ou menor que zero");
		} 
		
		this.nome = nome;
		this.preco = preco;
		this.maiorScore = 0;
		this.numeroAcessos = 0;
		this.zerouJogo = 0;
		this.tipoJogo = tipoJogo;
		
	}
	
	/**
	 * 
	 * @param score
	 * @param zerou
	 * @return um int que sera o x2p nas classes filhas
	 * @throws NumeroInvalidoException
	 * Lanca uma excecao se o score for menor que zero
	 * 
	 */
	public int registraJogada(int score, boolean zerou) throws NumeroInvalidoException{
				
		if(score < 0){
			throw new NumeroInvalidoException("Score");
		} else {
			
			if (score > this.maiorScore){
				this.maiorScore = score;
				
			}
			
			if (zerou){
				this.zerouJogo = zerouJogo +1;
				
			}
		
			this.numeroAcessos = numeroAcessos +1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		string.append(" " + this.nome + " :");
		System.out.println("");
		string.append("==> Jogou " + numeroAcessos + " vez(es)");
		System.out.println("");
		string.append("==> Zerou " + zerouJogo + " vez(es)");
		System.out.println("");
		string.append("==> Maior score: " + maiorScore);
		System.out.println("");
		
		return string.toString();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	
		if (obj instanceof Jogo){
			Jogo outroJogo = (Jogo) obj;
			if (this.nome.equals(outroJogo.nome) && this.preco == outroJogo.preco){
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * Metodos acessadores e modificadores
	 * 
	 */

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

	public int getNumeroAcessos() {
		return numeroAcessos;
	}

	public void setNumeroAcessos(int numeroAcessos) {
		this.numeroAcessos = numeroAcessos;
	}

	public int getZerouJogo() {
		return zerouJogo;
	}
	
	public void setZerouJogo(int zerouJogo) {
		this.zerouJogo = zerouJogo;
	}

	public String getTipoJogo() {
		return tipoJogo;
	}

	public void setTipoJogo(String tipoJogo) {
		this.tipoJogo = tipoJogo;
	}
	

}