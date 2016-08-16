package Usuario;

import jogo.Jogo;

//noob e veterano tem que possuir uma lista de usuarios ???
public class Noob extends Usuario {

	private int desconto = 10; //10 % de desconto
	private int x2p = 0;
	private Usuario usuario;

	
	public Noob(String nome, String nomeLogin, double dinheiro) {
		super(nome, nomeLogin, dinheiro);
		// TODO Auto-generated constructor stub
	}

	public void compraJogo(double preco){

		//double
		usuario.compraJogo();
		
	}
	
}
