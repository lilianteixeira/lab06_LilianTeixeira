package loja;

/**
 * 
 * @author Lílian Honorio Teixeira
 *  A classe Loja é responsável por cadastrar e modificar coisas em usuario, 
 *  e por vender jogo. 
 *
 */

import java.util.HashMap;
import exception.EntradaException;
import exception.UpgradeInvalidoException;
import exception.UsuarioInexistenteException;
import jogo.Jogo;
import usuario.*;

public class Loja {

	private HashMap<String, Usuario> usuarioEspecifico;

	public Loja(){
		usuarioEspecifico = new HashMap<String, Usuario>();
	}
	
	public Noob criaUsuarioNoob(String nome, String login, double dinheiro, int x2p) throws Exception{
		
		Noob usuarioNoob = new Noob(nome, login, dinheiro, x2p);
		return usuarioNoob;
	}
	
	public Veterano criaUsuarioVeterano(String nome, String login, double dinheiro, int x2p) throws Exception {
		
		Veterano usuarioVeterano = new Veterano(nome, login, dinheiro, x2p);
		return usuarioVeterano;
	}
	
	/**
	 * O metodo adiciona um  novo usuario, sempre comecando por Noob
	 * @param usuario
	 * @param nome
	 * @param usuarioNoob
	 * @throws EntradaException
	 */
	public void adicionaUsuario(Usuario usuario, String nome, Noob usuarioNoob) throws EntradaException{
		
		try {
			
			if (usuarioEspecifico.containsValue(usuario.getNome().equals(nome)) ==  false){
				usuarioEspecifico.put(nome ,usuarioNoob);
				
		}} catch (Exception e) {
			String mensagem = "Nome não pode ser nulo ou vazio";
					System.out.println(mensagem);
			
			}
		}

	/**
	 * 
	 * @param login
	 * @param usuario
	 * @param dinheiroExtra
	 * @return a quantidade de dinheiro do usuario
	 */
	public double adicionaDinheiro(String login, Usuario usuario, double dinheiroExtra){
		
		if (usuarioEspecifico.containsValue(usuario.getLogin().equals(login))){
			
			usuario.setDinheiro(usuario.getDinheiro() + dinheiroExtra);
			
		}
		
		return usuario.getDinheiro();
	}
	
	/**
	 * O metodo vende jogos aos usuarios
	 * @param jogo
	 * @param login
	 * @param nomeJogo
	 * @param preco
	 * @param jogosComprados
	 */
	public void vendeJogos(Jogo jogo, String login, String nomeJogo, double preco, Usuario jogosComprados){
		
		if(usuarioEspecifico.containsValue(login)){
			Usuario usuario = usuarioEspecifico.get(login);
			if (usuario.getDinheiro() > jogo.getPreco()){
				double retiraDinheiro = usuario.getDinheiro() - jogo.getPreco(); 
				usuario.setDinheiro(retiraDinheiro);
				
			}
		}
	}
		
	/**
	 * 
	 * @param login
	 * @return um objeto usuario
	 */
	public Usuario buscaLogin(String login){
		
		if (usuarioEspecifico.containsKey(login)){
			return usuarioEspecifico.get(login);
		}
		
		return null;
	}
	
	//cria jogo nao serve pra nada porque loja nao cria o jogo
	/**
	 * 
	 * @param tipoJogo
	 * @param nome
	 * @param preco
	 * @param maiorScore
	 * @param numeroAcessos
	 * @param zerouJogo
	 * @return o objeto jogo
	 * @throws EntradaException
	 *
	public String criaJogo(String tipoJogo, String nome, double preco, int maiorScore, int numeroAcessos, int zerouJogo, HashSet<Jogabilidade>  jogabilidade) throws EntradaException{
		
		Jogo jogo = new Jogo(nome, preco, maiorScore, numeroAcessos, zerouJogo, tipoJogo, jogabilidade);
		 return jogo.getTipoJogo();
	}*/
	
	/**
	 * 
	 * @param login
	 * @throws Exception
	 */
	public void upgrade(String login) throws Exception{
		
		Usuario usuario = buscaLogin(login);
		String nome = usuario.getNome();
		login = usuario.getLogin();
		double dinheiro = usuario.getDinheiro();
		int x2p = usuario.getX2p();
		
		usuarioEspecifico.remove(usuario);
		
		usuario = new Veterano(nome, login, dinheiro, x2p);
		
		usuarioEspecifico.put(login, usuario);
	
			
		if (usuario instanceof Veterano) {
						
			throw new UpgradeInvalidoException(usuario.getNome());
						
		}
		
		if (usuario.getX2p() < 1000) {
			
			throw new UpgradeInvalidoException();
						
		} 
			
		if (usuarioEspecifico.containsKey(usuario) == false){
			
			throw new UsuarioInexistenteException();
		}
				
				
} 	
	
	@Override
	public String toString( ) {
		
		StringBuffer string = new StringBuffer();
		
		string.append("=== Central P2-CG ===");
		System.out.println("");
		
		System.out.println("");
		string.append("--------------------------------");
		
		return string.toString();
	}

	

}
