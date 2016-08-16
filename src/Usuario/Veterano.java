package Usuario;

import jogo.Jogo;


public class Veterano extends Usuario{

	private int desconto = 20; //20 % de desconto
	private int x2p = 1000; //a cada compra de jogo ganha x2p
	private Usuario usuario;
	
	public Veterano(String nome, String nomeLogin, double dinheiro) {
		super(nome, nomeLogin, dinheiro);
		// TODO Auto-generated constructor stub
	}

	public void compraJogo(double preco){
		
		//double
		usuario.compraJogo();
		
	}
	
	
}
