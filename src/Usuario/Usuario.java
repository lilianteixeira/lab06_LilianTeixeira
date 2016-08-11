package Usuario;

import java.util.ArrayList;
//pode comprar jogos e adicionar mais dinheiro ao seu perfil

import jogo.Jogo;

public class Usuario {

	private String nome;
	private String nomeLogin;
	private ArrayList<Jogo> listaDeJogosComprados;
	private double dinheiro;
	
	//construtor
	public Usuario(String nome, String nomeLogin, double dinheiro) {
	
		this.nome = nome;
		this.nomeLogin = nomeLogin;
		this.dinheiro = dinheiro;
		
		listaDeJogosComprados = new ArrayList<Jogo>();
		
	}

	//acessadores e modificadores 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeLogin() {
		return nomeLogin;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public ArrayList<Jogo> getListaDeJogosComprados() {
		return listaDeJogosComprados;
	}

	public void setListaDeJogosComprados(ArrayList<Jogo> listaDeJogosComprados) {
		this.listaDeJogosComprados = listaDeJogosComprados;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	
}
