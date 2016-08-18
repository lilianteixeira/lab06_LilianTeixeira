package usuario;

/**
 * 
 * @author Lílian Honorio Teixeira
 *  A classe Usuario é abstrata, proporcionanado assim a criação de metodos abstratos
 *  que podem ser reescritos pelas classes filhas.
 *
 */

import java.util.ArrayList;

import jogo.Jogo;

import exception.EntradaException;
import exception.NumeroInvalidoException;
import exception.SaldoInsuficienteException;
import exception.StringInvalidaException;

 public abstract class Usuario {

	private String nome;
	private String login;
	private double dinheiro;
	private int x2p;
	private ArrayList<Jogo> jogosComprados;
	private int quantidadeZerou;
	
	public Usuario(String nome, String login, double dinheiro) throws EntradaException{
		
		if (nome == null || nome == ""){
			throw new StringInvalidaException("nome");
		}
		
		if (login == null || login == ""){
			throw new StringInvalidaException("login");
		}
		
		if (dinheiro < 0){
			throw new NumeroInvalidoException("Dinheiro do usuario");
		}
		
		this.nome = nome;
		this.login = login;
		this.dinheiro = dinheiro;
		this.x2p = 0;
		this.jogosComprados = new ArrayList<Jogo>();
		this.quantidadeZerou = quantidadeZerou;
		
	}
	
	abstract double calculaDesconto(double precoJogo);
	
	abstract double x2p(Jogo jogo);
	
	public Jogo buscaJogo(String nomeDoJogo){
		
		for (Jogo jogo: jogosComprados){
			if (jogo.getNome().equals(nomeDoJogo)){
				return jogo;
			}
		}
		return null;
		
	}
	
	/**
	 * acessa os dados e ve se precisa ser modificado
	 * @param nomeDoJogo
	 * @param score
	 * @param zerou
	 * @throws NumeroInvalidoException
	 */
	public void registraJogada(String nomeDoJogo, int score, boolean zerou) throws NumeroInvalidoException{
		int x2pNovo;
		
		Jogo jogo = buscaJogo(nomeDoJogo);
		jogo.registraJogada(score, zerou);
		
		x2pNovo = jogo.registraJogada(score, zerou);
				
		this.x2p = this.x2p + x2pNovo;
		setX2p(x2p);
			
		
		
		if (zerou ){
			quantidadeZerou += 1;
			setQuantidadeZerou(quantidadeZerou);
		}
	}
	
	public void adicionaDinheiro(double dinheiro){
		dinheiro += getDinheiro();
		setDinheiro(dinheiro);
	}
	
	/**
	 * vende jogo ao usuario 
	 * @param jogo
	 * @throws SaldoInsuficienteException
	 */
	public void compraJogo(Jogo jogo)throws SaldoInsuficienteException{
		if (this.dinheiro > jogo.getPreco()){
			
			double desconto = calculaDesconto(jogo.getPreco());
			double precoFinal = jogo.getPreco() - desconto;
			
			this.dinheiro = this.dinheiro - precoFinal;
			setDinheiro(dinheiro);
			
			jogosComprados.add(jogo);
			
			x2p(jogo);
		} else{
			throw new SaldoInsuficienteException();
		}
	}
	
	
	
	@Override
	public String toString() {
		
		StringBuffer string = new StringBuffer();
		
		string.append(this.login);
		System.out.println("");
		string.append(this.nome);
		System.out.println("");
		string.append("Lista de Jogos:");
		System.out.println("");
		
		return string.toString();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Usuario){
			
			Usuario outroUsuario = (Usuario) obj;
			if(this.login.equals(outroUsuario.login)){
				return true;
			}
		}
		return false;
	}
	
/**
 * 
 * Metodos de acesso e modificacoes	
 * 
 */
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public double getDinheiro() {
		return dinheiro;
	}


	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}


	public ArrayList<Jogo> getListaDeJogos() {
		return jogosComprados;
	}


	public void setListaDeJogos(ArrayList<Jogo> listaDeJogos) {
		this.jogosComprados = listaDeJogos;
	}
	
	
	public int getX2p() {
		return x2p;
	}
	
	
	public void setX2p(int x2p){
		this.x2p = x2p;
	}
	
	public ArrayList<Jogo> getJogosComprados() {
		return jogosComprados;
	}
	
	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}

	public int getQuantidadeZerou() {
		return quantidadeZerou;
	}

	public void setQuantidadeZerou(int quantidadeZerou) {
		this.quantidadeZerou = quantidadeZerou;
	}

	
}
 