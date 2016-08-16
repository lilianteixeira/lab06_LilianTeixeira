package loja;

import java.util.ArrayList;
import jogo.Jogo;
import Usuario.Usuario;
/**
 * 
 * @author lilianht
 *
 *a loja é responsavel por imprimir os dados no console e capturas de Exceptions
 *
 */

public class Loja {

	private ArrayList<Usuario> listaDeUsuarios;
	private Usuario usuario;
	private Jogo jogo;
	
	public Loja() {

		listaDeUsuarios = new ArrayList<Usuario>();
		
	}
	
	private Usuario pesquisaUsuario(String login){
		
		if (listaDeUsuarios.contains(usuario.getNomeLogin().equalsIgnoreCase(login))){
			return usuario;
		}
		
		return null;
	}
	
	public void adicionaUsuario(String nome, String nomeLogin, double dinheiro){
		
		usuario = new Usuario(nome, nomeLogin, dinheiro);
		listaDeUsuarios.add(usuario);
		
	}
	
	public void adicionaDinheiro(double dinheiro, String login){
		
		if(pesquisaUsuario(login) != null){
			
			double dinheiroAntigo = usuario.getDinheiro();
			
			double dinheiroNovo = dinheiroAntigo += dinheiro;
			
			usuario.setDinheiro(dinheiroNovo);
			
		}
		
	}
	
	public boolean vendeJogos(String login){
		
		if(pesquisaUsuario(login) != null && usuario.getDinheiro() < jogo.getPreco()) {
			
			return true;
			
		}
		
		return false;
	}

	
	@Override
	public String toString() {
		
		String imprimir ;
		imprimir  = "=== Central P2-CG ==  /n" + usuario.getNomeLogin() + "/n " 
		+ usuario.getNome() + "- Jogador "  ;
		
		//rever toString
		
		return "Loja [usuario=" + usuario + ", jogo=" + jogo + "]";
		
		
	}
	
	
	
}
